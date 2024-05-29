package challenges;

public class MinutesAndSecondsChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(8000));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be a positive integer number";
        }
        int minutes = seconds / 60;
        return  getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Invalid data for seconds(" + minutes + "), must be a positive integer number";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours +  "h " + remainingMinutes + "m " + remainingSeconds + "s ";
    }
}
