package challenges;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(4839));

        System.out.println(getEvenDigitSum(2458, 0));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            int digit = number % 10;
            if (digit % 2==0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int getEvenDigitSum(int number, int y) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }
        return sum;
    }
}
