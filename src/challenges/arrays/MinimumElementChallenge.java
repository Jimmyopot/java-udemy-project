package challenges.arrays;

import java.util.Scanner;

public class MinimumElementChallenge {
    /*
    Minimum Element
    Write a method called readInteger() that has no parameters and returns an int.
    It needs to read in an integer from the user - this represents how many elements the user needs to enter.
    Write another method called readElements() that has one parameter of type int
    The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
    And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
    */
    public static void main(String[] args) {
        int readInts = readIntegers();
        readElements(2);
    }

    private static int readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
