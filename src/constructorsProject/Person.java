package constructorsProject;

public record Person(String name, String dob) {

//    public Person(String name, String dob) {
//        this.name = name;
//        this.dob = dob.replace('-', '/');
//    }

    public Person(Person p) {
        this(p.name, p.dob);
    }

    public Person {
        if (dob == null) try {
            throw new IllegalAccessException("Bad data");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        dob = dob.replace('-', '/');
    }
}
