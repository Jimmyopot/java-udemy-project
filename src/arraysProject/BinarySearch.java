package arraysProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        String[] sArray = {"Abel", "Grace", "John", "Sylvia", "Brittney", "Mark"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 9};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
