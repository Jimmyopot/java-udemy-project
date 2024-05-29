
public class ClassesAndObjectsPart1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Mercedes");
        car.setModel("S 550");
        car.setColor("Lime green");
        car.setDoors(5);

        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());

        car.describeCar();

        System.out.println(" ");
        
        Car car2 = new Car();

        car.setMake("Porsche");
        car.setModel("Avolin");
        car.setColor("gray");
        car.setDoors(2);

        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());

        car.describeCar();

        // Bank account

        BankAccount jillsAccount = new BankAccount("12500", 12.98, "Jill", "jill@gmail.com", "0910929893");
        System.out.println(jillsAccount.getBalance());

        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getNumber() +
                "; name " + timsAccount.getCustomerName());

        Customer customer1 = new Customer();
        System.out.println(customer1.getCreditLimit());

        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmailAddress());

        Customer customer3 = new Customer("Joe", "joe.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmailAddress());
    }
}