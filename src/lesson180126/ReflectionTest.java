package lesson180126;


public class ReflectionTest {

    private final String str = null;

    @MyCuteTestAnnotation
    public void testBaseCase() {
        System.out.println("I'm a base case method: " + str);
    }

    @MyCuteTestAnnotation
    public void testLowerBound() {
        System.out.println("I'm a lower bound method: " + str);
    }
}