package gameConsole;

public record Shooter(String name) implements Player {
    boolean findPrice() {
        System.out.println("Price found, score should be adjusted");
        return false;
    }

    boolean useWeapon(String weapon) {
        System.out.println("You shot your " + weapon);
        return false;
    }
}
