import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public class Branch {
        // write code here
        private String name;
        private ArrayList<Customer> customers;

        public Branch(String name) {
            this.name = name;
            this.customers = new ArrayList<Customer>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<Customer> getCustomers() {
            return customers;
        }


    }
}