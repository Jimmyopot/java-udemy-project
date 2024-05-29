package challenges;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10 || num1 > 99) && (num2 < 10 || num2 > 99)) {
            return  false;
        }

        while (num1 > 0) {
            int digit1 = num1 % 10;

            while (num2 > 0) {
                int digit2 = num2 % 10;
                if (digit1 == digit2) {
                    return true;
                }
                num2 /= 10;
            }

            num1 /= 10;
        }

        return  false;
    }
}
