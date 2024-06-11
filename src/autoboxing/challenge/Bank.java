package autoboxing.challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    public Customer getCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New Customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }

        System.out.println("_".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions:");
        for (double d : customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }

//    public boolean addCustomer(String customerName, double initialTransaction) {
//        if (findCustomer(customerName) == null) {
//            this.customers.add(new Customer(customerName));
//            addTransaction(customerName, initialTransaction);
//            return true;
//        }
//        return false;
//    }



//    public Customer findCustomer(String customerName) {
//        for (Customer checkedCustomer : this.customers) {
//            if (checkedCustomer.getName().equals(customerName)) {
//                return checkedCustomer;
//            }
//        }
//        return null;
//    }

//    public void listCustomers() {
//        System.out.println("Customer List: ");
//        for (int i = 0; i < this.customers.size(); i++) {
//            Customer customer = this.customers.get(i);
//            System.out.println((i+1) + ". " + customer.getName() + " -> Balance: " + customer.getBalance());
//            System.out.println("    Transactions: " + customer.getTransactions());
//        }
//    }
}
