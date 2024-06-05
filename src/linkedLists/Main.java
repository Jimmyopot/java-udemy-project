package linkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("New York");
        placesToVisit.add(0, "Washington DC");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
    }

    private static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Mumbai");
        list.addLast("Johannesburg");

        // Queue methods
        list.offer("Pretoria");
        list.offerFirst("Rabat");
        list.offerLast("Kinshasa");

        // Stack methods
        list.push("Barcelona");
    }

    private static void removeElement(LinkedList<String> list) {
        list.remove(5);
        list.remove("Rabat");
    }
}
