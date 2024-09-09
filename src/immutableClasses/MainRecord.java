package immutableClasses;

public class MainRecord {
    public static void main(String[] args) {
        PersonRecord jane = new PersonRecord("Jane", "01/01/2003");
        PersonRecord jim = new PersonRecord("Jim", "11/23/2001");
        PersonRecord joe = new PersonRecord("Joe", "03/11/2004");

        PersonRecord[] johnsKids = {jane, jim, joe};
        PersonRecord john = new PersonRecord("John", "05/10/1982", johnsKids);

        System.out.println(john);

        PersonRecord johnCopy = new PersonRecord("John", "05/05/1982");
        System.out.println(johnCopy);

        PersonRecord[] kids = johnCopy.kids();
        kids[0] = jim;
        kids[1] = new PersonRecord("Ann", "19/12/2006");
        System.out.println(johnCopy);
    }
}
