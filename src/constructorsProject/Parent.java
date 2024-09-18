package constructorsProject;

public class Parent {
    static {
        System.out.println("Parent static initializer: class being constructed");
    }
    private final String name;
    private final String dob;
    protected final int siblings;

//    public Parent() {
//        System.out.println("In Parent's No Args Constructor");
//    }

    {
//        name = "John Doe";
//        dob = "01/01/2010";
        System.out.println("In Parent Initialized");
    }

    public Parent(String name, String dob, int siblings) {
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;
        System.out.println("In Parent Constructor");
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", dob='" + dob+ '\'';
    }
}
