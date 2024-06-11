package autoboxing.challenge;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);

    }
}

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Don", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.getCustomer("Martin");
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("Jane A", -75.01);
        bank.printStatement("Jane A");
    }
}
