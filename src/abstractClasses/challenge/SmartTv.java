package abstractClasses.challenge;

public class SmartTv extends ProductForSale {
    public SmartTv(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufuctured in China");
        System.out.printf("The price of the phone is $%6.2f %n", price);
        System.out.println(description);
    }
}
