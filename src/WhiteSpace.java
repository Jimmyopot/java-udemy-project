
public class WhiteSpace {
    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        System.out.println("This is a test");

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
}
