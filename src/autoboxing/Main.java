package autoboxing;

public class Main {
    public static void main(String[] args) {
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }
}
