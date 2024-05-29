package challenges;

public class SumCalculator {
    private double firstNumber = 33.43;
    private double secondNumber = 18.89;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return secondNumber - firstNumber;
    }

    public double getMultiplicationResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
}
