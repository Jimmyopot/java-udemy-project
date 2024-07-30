package collectionsOverview;

import java.util.*;

/*
                 Collection
                     ^                                Map
    List            Set            Queue               ^
                     ^               ^             SortedMap
                 SortedSet         Deque
*/

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new HashSet<>();

        String[] names = {"Anna", "Bob", "Carol", "David", "Edna"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Grace");
        list.addAll(Arrays.asList("George", "Gary", "James"));
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));

        list.removeIf(s -> s.charAt(0) == 'G');
        System.out.println(list);
        System.out.println("Gary is in the list? " + list.contains("Gary"));
    }
}
