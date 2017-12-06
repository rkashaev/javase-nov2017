package lesson171205;


public class Mathematica {
    public Mathematica(Num obj) {
        System.out.println("Num");
    }

    public Mathematica(Int obj) {
        System.out.println("Int");
    }

    public Mathematica(Num obj1, Int obj2) {
        System.out.println("Num, Int");
    }

    public Mathematica(Int obj1, Int obj2) {
        System.out.println("Int, Int");
    }

    public Mathematica(Int obj1, Num obj2) {
        System.out.println("Int, Num");
    }


    public static void main(String[] args) {
        Num num1 = new Num();
        Int int1 = new Int();
        LongInt longInt = new LongInt();
        Num trickyInt = new Int();

        new Mathematica(num1);
        new Mathematica(int1);
        new Mathematica(longInt);
        new Mathematica(trickyInt);
        new Mathematica(num1, int1);
        new Mathematica(longInt, int1);
        new Mathematica(longInt, longInt);
//        new Mathematica(num1, trickyInt);//error
//        new Mathematica(longInt, trickyInt);//error
    }
}

class Num {
}

class Int extends Num {
}

class LongInt extends Int {
}
