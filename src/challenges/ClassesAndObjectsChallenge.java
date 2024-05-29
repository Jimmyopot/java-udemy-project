package challenges;

public class ClassesAndObjectsChallenge {
    public static void main(String[] args) {
        SumCalculator calc1 = new SumCalculator();
        System.out.println(calc1.getDivisionResult());

        Person james = new Person();
        james.setFirstName("James");
        james.setlastName("Bill");
        System.out.println(james.getFullName());
    }
}
