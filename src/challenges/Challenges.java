package challenges;

public class Challenges {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("New final score is " + finalScore);
        }

        printConversion(34);

        System.out.println(area(5.0));
        System.out.println(area(10, 40));

        printYearsAndDays(800000);

        printEqual(6, 6, 6);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            double milesPerHour = kilometersPerHour / 1.60934;

            long roundedMilesPerHour = Math.round(milesPerHour);

            return roundedMilesPerHour;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static double area(double radius) {
        if (radius < 1) {
            return -1.0;
        }
        return 3.141592653589793 * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 && y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        long convertminToYears = minutes / 525600L;
        System.out.println("This minutes to years are " + convertminToYears);
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && y == z && x == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && y != z && x != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }
}