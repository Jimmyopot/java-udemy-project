
public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Jim");

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        } else {
            System.out.println("It is an alien");
        }

        int topScore = 80;
        if (topScore != 100) {
            System.out.println("You have the high score");
        }else {
            System.out.println("Not passed!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        int newValue = 50;
        if(newValue == 50) {
            System.out.println("This is equal");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("Blue Mercedece Benz");
        } else {
            System.out.println("Just a probox");
        }

        String makeOfCar = "Toyota";
        boolean isDomestic = makeOfCar == "Toyota" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        } else {
            System.out.println("Not domestic in our country");
        }

        // CHALLENGE
        double doubleVal1 = 20.00;
        double doubleVal2 = 80.00;
        double totalAdd = (doubleVal1 + doubleVal2) * 100.00;
        double reminder = totalAdd % 40.00;

        boolean isReminder = (reminder == 0.00) ? true : false;

        System.out.println(isReminder);

        if (isReminder) {
            System.out.println("Got some reminder");
        }
    }
}
