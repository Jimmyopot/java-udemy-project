package abstractClasses.challenge;

public class SmartPhone extends ProductForSale {
    public SmartPhone(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a beautiful model");
        System.out.printf("The price of the phone is $%6.2f %n", price);
        System.out.println(description);
    }


}
