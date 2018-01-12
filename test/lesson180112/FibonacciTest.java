package lesson180112;

import org.junit.Before;
import org.junit.Test;

import static java.lang.String.format;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class FibonacciTest {

    private Fibonacci fb;

    @Before
    public void setup() {
        fb = new Fibonacci();
    }

    @Test
    public void testBaseCase() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

        // we skip 0-th index
        for (int i = 1; i < expected.length; i++) {

            int act = fb.getNumber(i);

            assertEquals(format("The %dth element must be %d", i, expected[i]),
                    expected[i], act);
        }
    }

    @Test
    public void testLowerBound() {
        int[] badIndexes = {0, -1, -100, -1000, Integer.MIN_VALUE};

        for (int idx : badIndexes) {
            try {
                fb.getNumber(idx);

                fail("Element with index < 0 must throw an exception");
            } catch (IllegalArgumentException e) {
                // this is horosho
            }
        }
    }


}