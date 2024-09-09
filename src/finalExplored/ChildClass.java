package finalExplored;

public class ChildClass extends BaseClass {
    @Override
    protected void optionalMethod() {
        System.out.println("[Child:optionalMethod] Extra stuff here");
        super.optionalMethod();
    }

//    @Override
//    public void recommendedMethod() {
//        System.out.println("[Child:recommendedMethod]: I'll do things my way");
//        optionalMethod();
//    }

    public void mandatoryMethod() {
        System.out.println("[Child:mandatoryMethod] my own important stuff");
    }

    public static void recommendedStatic() {
        System.out.println("[Child.recommendedStatic] : Best way to do it");
        optionalStatic();
//        mandatoryStatic();
    }
}
