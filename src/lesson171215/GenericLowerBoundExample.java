package lesson171215;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundExample {
    public static void main(String[] args) {
        List<? super Cat> list1;
//        list1 = new ArrayList<Tiger>(); // can't do
        list1 = new ArrayList<Cat>();
        list1 = new ArrayList<Animal>();
        list1 = new ArrayList<Object>();

        modifyMyListPlease(list1);

        List<? extends Cat> list2;
        list2 = new ArrayList<Cat>();
        list2 = new ArrayList<Tiger>();
        list2 = new ArrayList<PussyCat>();
//        list2.add(new Cat()); //error

    }

    private static void modifyMyListPlease(List<? super Cat> list1) {
//        list1.add(new Object());
//        list1.add(new Animal());
        list1.add(new Cat());
        list1.add(new Tiger());
        list1.add(new PussyCat());
    }


}

class Animal {

}

class Cat extends Animal {

}

class Tiger extends Cat {

}

class PussyCat extends Cat {

}

class Dog extends Animal {

}

class HotDog extends Dog {

}