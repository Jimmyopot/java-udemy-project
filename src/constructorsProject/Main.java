package constructorsProject;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Jane Doe", "09/12/2010", 4);
        Child child = new Child();

        System.out.println("Parent: " + parent);
        System.out.println("Child: " + child);

        Person joe = new Person("Joe", "01-01-2013");
        System.out.println(joe);

        Person joeCopy = new Person(joe);
        System.out.println(joeCopy);

        System.out.println("----------------------------");
        GenerationEnum g = GenerationEnum.BABY_BOOMER;
    }
}
