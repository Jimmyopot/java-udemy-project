package linkedLists;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("New York");
        placesToVisit.add(0, "Washington DC");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElement(placesToVisit);
//        System.out.println(placesToVisit);

//        gettingElements(placesToVisit);
//        printItinerary3(placesToVisit);

        testIterator(placesToVisit);
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

        System.out.println(list);
        String s1 = list.remove();
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst();
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " was removed");

        // Queue/Deque poll methods
        String p1 = list.poll();
        System.out.println(p1 + " was removed");

        String p2 = list.pollFirst();
        System.out.println(p2 + " was removed");

        String p3 = list.pollLast();
        System.out.println(p3 + " was removed");

        // Stack - push
        list.push("Sydney");
        list.push("Lisbon");
        list.push("Hamburg");
        list.push("Brussels");

        String p4 = list.pop();
        System.out.println(p4 + " was removed");
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Johannesburg is at position: " + list.indexOf("Johannesburg"));
        System.out.println("Kinshasa is at position: " + list.lastIndexOf("Kinshasa"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());

        // Stack retrieval method
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }
    
    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    // LIST ITERATORS
    public static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Kinshasa")) {
                iterator.remove();
                iterator.add("England");
            }
        }
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.next());
    }
}
