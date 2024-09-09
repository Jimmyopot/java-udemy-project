package copyingClasses;

import java.util.Arrays;

record Person(String name, String dob, Person[] kids){

    public Person(Person p) {
        this(p.name, p.dob,
                p.kids == null ? null : Arrays.copyOf(p.kids, p.kids.length));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", kids=" + Arrays.toString(kids) +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Person joe = new Person("Joe", "01/01/2000", null);
        Person jim = new Person("Jim", "11/12/2001", null);
        Person jack = new Person("Jack", "12/01/2003",
                new Person[]{joe, jim});
        Person jane = new Person("Jane", "23/04/2002", null);
        Person jill = new Person("Jill", "17/09/2005",
                new Person[]{joe, jim});

        Person[] persons = {joe, jim, jack, jane, jill };
//        Person[] personsCopy = Arrays.copyOf(persons, persons.length);
        Person[] personsCopy = new Person[5];
        Arrays.setAll(personsCopy, i-> new Person(persons[i]));

//        for (int i = 0; i < 5; i++) {
//            personsCopy[i] = new Person(persons[i]);
//        }

        var jillsKids = personsCopy[4].kids();
        jillsKids[1] = jane;

        for (int i = 0; i < 5; i++) {
            if (persons[i] == personsCopy[i]) {
                System.out.println("Equal References " + persons[i]);
            }
        }
        System.out.println(persons[4]);
        System.out.println(personsCopy[4]);
    }
}
