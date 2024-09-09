package immutableClasses;

public class Main {
    public static void main(String[] args) {
//        Person jane = new Person();
//        jane.setName("Jane");
//        Person jim = new Person();
//        jim.setName("Jim");
//        Person joe = new Person();
//        joe.setName("Joe");
//        Person john = new Person();
//        john.setName("John");
//        john.setDob("05/05/2000");
//        john.setKids(new Person[]{jane, jim, joe});
//        System.out.println(john);
//
//        john.setName("Jacob");
//        john.setKids(new Person[]{new Person(), new Person()});
//        System.out.println(john);

        Person jane = new Person("Jane", "01/01/2003");
        Person jim = new Person("Jim", "11/23/2001");
        Person joe = new Person("Joe", "03/11/2004");

        Person[] johnsKids = {jane, jim, joe};
        Person john = new Person("John", "05/10/1982", johnsKids);

        System.out.println(john);

        Person[] kids = john.getKids();
        kids[0] = jim;
        System.out.println(john);

        kids = null;
        System.out.println(john);

        john.setKids(kids);
        System.out.println(john);
    }
}
