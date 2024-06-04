package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItems(String name, String type, int count) {
    public GroceryItems(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryItems[] groceryArray = new GroceryItems[3];
        groceryArray[0] = new GroceryItems("Milk");
        groceryArray[1] = new GroceryItems("Apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItems("Oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItems> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItems("Butter"));
        groceryList.add(new GroceryItems("Yogurt"));
        groceryList.add(new GroceryItems("Milk"));
        groceryList.set(0, new GroceryItems("Apples", "PRODUCE", 6));
        System.out.println(groceryList);
    }
}
