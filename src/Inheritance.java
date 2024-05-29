
public class Inheritance {
    public static void main(String[] args) {
        AnimalInheritance animalInheritance = new AnimalInheritance("Generic Animal", "Huge", 400);
        doAnimalStuff(animalInheritance, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish tilapia = new Fish("Tilapia", 0.25, 2, 3);
        doAnimalStuff(tilapia, "fast");

        // CHALLENGES
        Employee employee1 = new Employee("Tim", "11/11/1999", "01/01/2021");
        System.out.println(employee1);
        System.out.println("Age = " + employee1.getAge());

        Employee employee2 = new Employee("Joe", "11/11/1999", "01/01/2021");
        System.out.println(employee2);
        System.out.println("Age = " + employee1.getAge());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/2009", "03/03/2022", 350000);
        System.out.println(joe);
        System.out.println("Joe's paycheck is " + joe.collectPay());

        joe.retire();

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/2002", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday = $" + mary.getDoublePay());

    }

    public static void doAnimalStuff(AnimalInheritance animalInheritance, String speed) {
        animalInheritance.makeNoise();
        animalInheritance.move(speed);
        System.out.println(animalInheritance);
        System.out.println("_ _ _ _");
    }
}
