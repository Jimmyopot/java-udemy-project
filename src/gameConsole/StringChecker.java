package gameConsole;

import java.util.function.Predicate;

public class StringChecker implements SealedInterface {
    @Override
    public boolean testData(Predicate<String> p, String... strings) {
        return false;
    }
}
