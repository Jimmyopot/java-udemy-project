package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String aText = "Hello";
        String bText = "Hello";
        String cText = String.join("l", "He", "lo");
        String dText = "He".concat("llo");
        String eText = "hello";

        List<String> hellos = Arrays.asList(
                aText, bText, cText, dText, eText
        );

        hellos.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        // HASH SETS
        /*
            - List allows duplicate elements, whereas Set does not.
            - Set ensures uniqueness by rejecting duplicates.
            - Set does not maintain any specific order. The order of elements in a Set may change over time.

            - Operations (add, remove, contains, size)
            - Big O - O(1)
        */
        Set<String> mySet = new HashSet<>(hellos);
        System.out.println("mySet = " + mySet);
        System.out.println("# of elements = " + mySet.size());

        System.out.println("-------------------------------");

        PlayingCard aceHearts = new PlayingCard("Hearts", "Ace");
        PlayingCard kingClubs = new PlayingCard("Clubs", "King");
        PlayingCard queenSpades = new PlayingCard("Spades", "Queen");

        List<PlayingCard> cards = Arrays.asList(aceHearts, kingClubs, queenSpades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));

        Set<PlayingCard> deck = new HashSet<>();
        for (PlayingCard c : cards) {
            if (!deck.add(c)) {
                System.out.println("Found a duplicate for " + c);
            }
        }
        System.out.println(deck);
    }
}
