
public class AllAboutStrings {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorldLower.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorldLower.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        if (helloWorldLower.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

        // ************ STRING METHODS ************************

        String birthDate = "25/11/1999";
        int startingIndex = birthDate.indexOf("1999");
        System.out.println("StartingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3, 5));
        String newDate = String.join("/", "25", "11", "1999");

        newDate = "27".concat("/").concat("13").concat("/")
                .concat("2003");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("3", "8"));
    }

    public static void printInformation(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }

        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
