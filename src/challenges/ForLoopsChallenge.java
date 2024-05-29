package challenges;

public class ForLoopsChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                count++;
                System.out.println(i);
            }
            if (count == 5) {
                break;
            }
        }

        System.out.println("Sum of numbers divisible by both 3 and 5: " + sum);

        System.out.println(isOdd(7));

        System.out.println(sumOdd(69, 3));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if ((start <= 0) || (end <= 0) || (end < start)) {
            return  -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return  sum;
    }
}