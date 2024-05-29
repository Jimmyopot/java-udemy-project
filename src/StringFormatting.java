
public class StringFormatting {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }
    }
}
