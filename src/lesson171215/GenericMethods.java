package lesson171215;

public class GenericMethods {

    public static <T extends Number> byte asByte(T num) {
        long n = num.longValue();
        //System.out.println(num.getClass());
        if (n >= -128 && n <= 127)
            return (byte) n;
        else return 0;
    }

    public static <T extends Number> T asT(String str) {
        T res = (T) new Integer(100);

        return res;
    }

    public static void main(String[] args) {
        System.out.println(asByte(7));
        System.out.println(asByte(7.0));

        Object a = asT("sdfdsf");
    }
}
