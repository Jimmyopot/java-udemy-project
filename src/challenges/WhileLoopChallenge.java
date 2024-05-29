package challenges;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(102));

        System.out.println(" ");

        int i = 4;
        int j = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (i <= j) {
            i++;
            if (!isEvenNumber(i)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + i);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);

        System.out.println(" ");

        System.out.println("The sum of the digits is " + sumDigits(32123));
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum =+ (number % 10);
            number = (number / 10);
        }
        sum += number;

        return sum;
    }
}
