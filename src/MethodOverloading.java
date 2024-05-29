
public  class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("John", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);

        // CHALLENGE
        System.out.println("From inch to cm " + convertToCentimeters(20));
        System.out.println(convertToCentimeters(5, 8));

        getDurationString(20000);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + " scored " + score + " points");
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    // CHALLENGES

    public static double convertToCentimeters(int heightInInches) {
        return heightInInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        return convertToCentimeters((heightInFeet * 12) + heightInInches);
    }

    public static void getDurationString(int seconds) {
        double timeInHours = seconds * 0.000277778;
        System.out.println("Time in Hours " + timeInHours);
    }

    public static void getDurationString(int seconds, int minutes) {
        double timeInHours = seconds * 0.000277778;
    }
}