package lesson171201;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class ArrayExamples {


    public static void main(String[] args) {
//        arrayCopyTest();

        System.out.println(Arrays.toString(args));

        Properties props = System.getProperties();

        for (Map.Entry<Object, Object> entry : props.entrySet()) {
//            System.out.print(entry.getKey()+" = ");
//            System.out.println(entry.getValue());
        }

        System.out.println(props.get("test"));
    }

    private static void arrayCopyTest() {
        int a1[][] = { { 1, 2 }, null };
        int a2[][] = a1.clone(); // shallow

        System.out.print((a1 == a2) + " ");
        System.out.println(a1[0] == a2[0] && a1[1] == a2[1]);

        printArrays(a1, a2);

        a2[0][1] = 4;

        printArrays(a1, a2);

        int[][] a3 = Arrays.copyOf(a1, a1.length);

        a3[0][1] = 2;

        printArrays(a1, a3);
    }

    private static void printArrays(int[][] a1, int[][] a2) {
        System.out.println(Arrays.deepToString(a1));
        System.out.println(Arrays.deepToString(a2));
    }
}
