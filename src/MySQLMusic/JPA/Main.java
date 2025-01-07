package MySQLMusic.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        try (var sessionFactory =
                     Persistence.createEntityManagerFactory(
                             "MySQLMusic.JPA/Main");
             EntityManager entityManager = sessionFactory.createEntityManager();
        ) {
            var transaction = entityManager.getTransaction();
            transaction.begin();
            Artist artist = entityManager.find(Artist.class, 103);
            System.out.println(artist);
//            artist.removeDuplicates();
//            artist.addAlbum("The Best of Muddy Waters");
//            System.out.println(artist);
//            entityManager.remove(artist);
//            entityManager.persist(new Artist("Muddy Water"));
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
