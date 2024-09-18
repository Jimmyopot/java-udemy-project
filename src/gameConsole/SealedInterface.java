package gameConsole;

import java.util.function.Predicate;

public interface SealedInterface {
    boolean testData(Predicate<String> p, String... strings);
}
