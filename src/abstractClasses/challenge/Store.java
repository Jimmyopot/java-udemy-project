package abstractClasses.challenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {}

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new SmartPhone("Tecon Camon 23", 300, "Added a new pixel camera"));
        storeProducts.add(new SmartPhone("IPhone 15", 429, "A triple camera system with 48MP main sensor and a robust 4441 mAh battery with fast charging technology"));

        storeProducts.add(new SmartTv("Samsung Lg", 200, "this smart TV  include a huge 43 inch FHD display with 1920 X 1080 resolution, Android 9.0 Pie Operating system, a powerful quad core CPU"));
        storeProducts.add(new SmartTv("Vitron", 145, "This smart TV key highlights include a huge 43 inch FHD 1080P display, Android 9 operating system,"));

        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        printOrder(order2);
    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printpricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }
}
