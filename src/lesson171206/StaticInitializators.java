package lesson171206;

public class StaticInitializators {
    public static void main(String[] args) {
        new Dog();

        new Cat();
    }
}


class Animal {
    static {
        System.out.println("I'm a static block in Animal");
    }
}

class Cat extends Animal {
    static {
        System.out.println("I'm a static block in Cat");
    }
}

class Dog extends Animal {
    static {
        System.out.println("I'm a static block in Dog");
    }
}