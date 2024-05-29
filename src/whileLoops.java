
public class whileLoops {
    public static void main(String[] args) {
        // While loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println(" ");

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

        System.out.println(" ");

        // Do While loops
        int i = 1;
        boolean isReady = false;
        do {
            if (i > 4 ) {
                break;
            }
            System.out.println(i);
            i++;
            isReady = (i > 0);
        } while (isReady);
    }
}
