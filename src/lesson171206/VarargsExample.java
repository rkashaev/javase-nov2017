package lesson171206;

public class VarargsExample {


    public static void varArgMethod(Integer... args) {
        if (args.length == 0) {
            System.out.println("No arguments");
        } else {
            for (int arg : args) {
                System.out.println("arg: " + arg);
            }
        }
    }

    public static void varArgMethod(Integer[]... args) {
        if (args.length == 0) {
            System.out.print("No arg2");
        }
        for (Integer[] mas : args) {
            for (int x : mas) {
                System.out.print("arg2:" + x + " ");
            }
        }
    }
    /*
    public static void varArgMethod(int a, int... arguments) {
        int[] args = new int[arguments.length+1];
        args[0] = a;
//        for (int i = 0; i < arguments.length; i++) {
//            args[i+1] = arguments[i];
//        }
        arraycopy(arguments, 0, args, 1, arguments.length);


        if (args.length==0) {
            System.out.println("No arguments");
        } else {
            for (int arg : args) {
                System.out.println("arg: " + arg);
            }
        }
    }*/


    public static void main(String[] args) {
        varArgMethod(100);
        varArgMethod(1, 2);
        varArgMethod(1, 2, 234, 2342, -23445);
        //varArgMethod(null); NPE

        Integer[] i = {1, 2, 3, 4, 5, 6, 7};
        varArgMethod(i);
        varArgMethod(i, i);

        //printArgCount(5, 7);
    }

    public static void printArgCount(int... args) { // 3
        System.out.print("int args: " + +args.length);
    }

    public static void printArgCount(Object... args) { // 1
        System.out.println("Object args: " + args.length);
    }

    public static void printArgCount(Integer[]... args) { // 2
        System.out.println("Integer[] args: " + args.length);
    }

}


