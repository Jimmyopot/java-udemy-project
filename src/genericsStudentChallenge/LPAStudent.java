package genericsStudentChallenge;

public class LPAStudent extends Student {
    private double percentageComplete;

    public LPAStudent() {
        percentageComplete = random.nextDouble(0, 100.001);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentageComplete);
    }

    public double getPercentageComplete() {
        return percentageComplete;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if (fieldName.equalsIgnoreCase("percentageComplete")) {
            return percentageComplete <= Integer.parseInt(value);
        }
        return super.matchFieldValue(fieldName, value);
    }
}
