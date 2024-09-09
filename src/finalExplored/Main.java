package finalExplored;

public class Main {
    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("--------------------");
        childReferredToAsBase.recommendedMethod();
        System.out.println("--------------------");
        child.recommendedMethod();

        System.out.println("--------------------");
        parent.recommendedStatic();
        System.out.println("--------------------");
        childReferredToAsBase.recommendedStatic();
        System.out.println("--------------------");
        child.recommendedStatic();

        System.out.println("--------------------");
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all I've got to say about section ";
        StringBuilder zArgument = new StringBuilder("Only saying this: section ");
        doXYZ(xArgument, 16, zArgument);
        System.out.println("After method, xArgument: " + xArgument);
        System.out.println("After method, zArgument: " + zArgument);

        StringBuilder tracker = new StringBuilder("Step 1 is abc");
        Logger.logToConsole(tracker.toString());
        tracker.append(", Step 2 is xyz");
        Logger.logToConsole(tracker.toString());
        System.out.println("After logging, tracker = " + tracker);
    }

    private static void doXYZ(String x, int y, StringBuilder z) {
        final String c = x + y;
        System.out.println("c = " + c);
        x = c;
        z.append(y);
    }
}
