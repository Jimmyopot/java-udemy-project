package MySQLMusic.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainQuery {
    public static void main(String[] args) {
        List<Artist> artists = null;
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory(
                "MySQLMusic.JPA/MainQuery");
            EntityManager em = emf.createEntityManager();) {
            var transaction = em.getTransaction();
            transaction.begin();
            artists = getArtistsJPQL(em, "%Stev%");
            artists.forEach(System.out::println);

            var names = getArtistsNames(em, "%Stev%");
            names.forEach(System.out::println);

            Stream<Artist> sartists = getArtistsBuilder(em, "");
            var map = sartists
                    .limit(10)
                    .collect(Collectors.toMap(
                            Artist::getArtistName,
                            (a) -> a.getAlbums().size(),
                            Integer::sum,
                            TreeMap::new
                    ));

            map.forEach((k,v) -> System.out.println(k + " : " + v));

            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Artist> getArtistsJPQL(EntityManager em, String matchedValue) {
        String jpql = "SELECT a FROM Artist a";
        var query = em.createQuery(jpql, Artist.class);
        return query.getResultList();
    }

    private static List<Tuple> getArtistsNames(EntityManager em, String matchedValue) {
        String jpql = "SELECT a.artistId, a.artistName FROM Artist a " +
                "WHERE a.artistName LIKE ?1";
        var query = em.createQuery(jpql, Tuple.class);
        query.setParameter(1, matchedValue);
        return query.getResultList();
    }

    private static Stream<Artist> getArtistsBuilder(EntityManager em, String matchedValue) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Artist> criteriaQuery = builder.createQuery(Artist.class);
        Root<Artist> root = criteriaQuery.from(Artist.class);
        criteriaQuery
                .select(root)
                .where(builder.like(root.get("artistName"), matchedValue))
                .orderBy(builder.asc(root.get("artistName")));
        return em.createQuery(criteriaQuery).getResultStream();
    }
}
