package challenges;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2,2,11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigKilos = bigCount  * 5;
        int totalKilos = bigKilos + smallCount;

        if (totalKilos < goal) {
            return false;
        }

        if (goal % 5 > smallCount) {
            return false;
        }

        return true;
    }
}
