
public class ForLoops {
    public static void main(String[] args) {
        // FOR LOOPS
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <=5; rate ++) {
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        System.out.println(" ");

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount2 = calculateInterest(100.0, rate);
            if (interestAmount2 > 8.5) {
                break;
            }
            System.out.println("100 at " + rate + "% interest = " + interestAmount2);
        }

        System.out.println(" ");

        for (int number = 0; number < 40; number += 10) {
            System.out.println("Number = " + number);
        }

    }
    public  static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
