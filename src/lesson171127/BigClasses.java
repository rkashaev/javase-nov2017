package lesson171127;

import java.math.BigInteger;

/**
 * Created by student on 27/11/17.
 */
public class BigClasses {

    public static void main(String[] args) {
        BigInteger numI1, numI2, bigNumI;
        numI1 = BigInteger.valueOf(1_000_000_000_000L);

        numI2 = numI1.multiply(numI1); System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1);

        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1); System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1); System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);
    }

}
