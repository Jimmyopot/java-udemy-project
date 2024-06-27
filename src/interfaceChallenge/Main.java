package interfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Radisson Blu", UsageType.ENTERTAINMENT));
        mappables.add(new Building("KICC", UsageType.GOVERNMENT));
        mappables.add(new Building("Kasarani Sports Grounds", UsageType.SPORTS));

        mappables.add(new UtilityLine("Kileleshwa", UtilityType.FIBER_OPTICS));
        mappables.add(new UtilityLine("Kilimani", UtilityType.WATER));

        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
