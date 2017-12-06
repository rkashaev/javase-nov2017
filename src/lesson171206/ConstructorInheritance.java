package lesson171206;

public class ConstructorInheritance {

    public static void main(String[] args) {
        Gamma a = new Gamma();
    }
}


class Beta {
    Beta() {
        System.out.print("1");
    }

    protected Beta(String str) {
        System.out.print("2");
    }
}

class Gamma extends Beta {
    public Gamma() {
        this("smth");
    }

    public Gamma(String str) {
    }
}