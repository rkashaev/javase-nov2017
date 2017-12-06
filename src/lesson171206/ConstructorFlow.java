package lesson171206;

public class ConstructorFlow {

    public static void main(String... args) {
//        C c = new C();
        System.out.println(C.MAX);
        C.staticMethod();
    }
}

class A {
    static {
        System.out.print("1 ");
    }

    A() {
        System.out.print("2 ");
    }

    A(String str) {
        this();
        System.out.print("3 ");
    }
}

class B extends A {
    static {
        System.out.print("4 ");
    }

    {
        System.out.print("10 ");
    }

    B() {
        System.out.print("5 ");
    }

    B(String str) {
        this();
        System.out.print("6 ");
    }
}

class C extends B {
    public static final int MAX = 10;


    static {
        System.out.print("7 ");
    }

    {
        System.out.print("8 ");
    }

    C() {
        super("Hello");
        System.out.print("9 ");
    }


    public static void staticMethod() {

    }

}
