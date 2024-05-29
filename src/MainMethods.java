
public class MainMethods {
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 1000, 8, 200);
        System.out.println(calculateMyAge(1994));

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Jimmy", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Beryl", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Grace", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Don", highScorePosition);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculateMyAge(int dateOfBirth) {
        return (2024 - dateOfBirth);
    }

    // CHALLENGE

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get to position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return position;
    }
}
