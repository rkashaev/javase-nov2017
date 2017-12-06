package lesson171127;

/**
 * Created by student on 27/11/17.
 */
public class ParameterPassingExample {


    public static void main(String[] args) {
        int a = 1;

        MutableInt myMegaInt = new MutableInt(100);

        myMethodRefMutable(myMegaInt);

        System.out.println("After the ref mutable call");

        System.out.println(myMegaInt);
    }

    private static void myMethod(int x) {
        x += 1;

        System.out.println(x);
    }

    private static void myMethodRef(Integer x) {
        x = Integer.valueOf(100); // new Integer(100);

        System.out.println(x);
    }

    private static void myMethodRefMutable(MutableInt x) {
//        x.value += 100;
        x = new MutableInt(x.value + 100);

        System.out.println(x);
    }


    static class MutableInt {
        int value;

        public MutableInt(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "MutableInt{" +
                    "value=" + value +
                    '}';
        }
    }
}
