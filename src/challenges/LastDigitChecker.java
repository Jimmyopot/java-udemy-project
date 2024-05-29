package challenges;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(isValid(1001));

        System.out.println(hasSameLastDigit(39, 45, 99));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }
}
