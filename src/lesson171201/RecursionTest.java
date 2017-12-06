package lesson171201;

public class RecursionTest {

    /**
     * 0, 1, 1, 2, 3, 5, ...
     *
     * @param n
     * @return
     */
    private int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        RecursionTest rt = new RecursionTest();

        for (int i = 1; i < 50; i++) {
            System.out.printf("%5d ", rt.fibonacci(i));
        }
    }
}
