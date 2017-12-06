package lesson171205;

import com.sun.istack.internal.NotNull;

public class OOPExamples {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.say(); // meow

        Cat d = null;

//        d.scratchBehindEar();

        c.walk();

    }
}


class Animal {
    public void say() {
        System.out.println("nope");
    }

    public static void walk() {
        System.out.println("an animal walks");
    }
}

class Cat extends Animal {


    @Override
    public void say() {
        System.out.println("meow");
    }

    public void scratchBehindEar() {

        //..
    }

    public static void walk() {
        System.out.println("a cat walks");
    }
}
