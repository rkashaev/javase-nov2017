package lesson171129;

/**
 * Created by student on 29/11/17.
 */
public class OperatorsExample {
    void switchTest() {
        String s = new String("one");

        switch (s) {
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            case "four":
                System.out.println("four");
                break;
            case "one":
                System.out.println("one");
                break;
            default:
                System.out.println("default");
        }
    }
}
