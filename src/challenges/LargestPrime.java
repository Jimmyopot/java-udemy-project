package challenges;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));
    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }

        int glp = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                glp = i;
            }
        }

        return glp;
    }
}
