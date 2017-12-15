package lesson171215;

public class InheritancePuzzlers {

    public static void main(String[] args) {
        A p = new A();
        B q = new B();
        p.print(q);
    }
}

class A {
    private void print() {
        System.out.println(777);
    }

    void print(A p) {
        p.print();
    }
}

class B extends A {
    void print() {
        System.out.println(666);
    }
}


