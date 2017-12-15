package lesson171215;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        Optional2 opt2 = new Optional2(12);

        int a = (Integer) opt2.getValue();

        List oldList = new ArrayList();

        oldList.add(32);
        oldList.add("234");

//        int o = (int) oldList.get(1); ClassCastException


        Integer[] intArr = {1, 2, 3};
        Object[] objArr = intArr;
        objArr[0] = "lalala";

        List<Integer> intList = new ArrayList<>();
//        List<Object> objList2 = intList; // can't do that because:
//        objList2.add("str");

        // type erasure in runtime
        List<String> strList = new ArrayList<>();
        System.out.println(intList.getClass());
        System.out.println(strList.getClass());

        List<?> objList = strList;

        printList(strList);
        printList(intList);

        List<? extends Number> anyNumberList = new ArrayList<Number>();
        anyNumberList = intList;
        anyNumberList = new ArrayList<BigDecimal>();
//        anyNumberList.add(10.F);


        // lower bounds examples

    }

    static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
//        list.add("str");
//        list.add(new Object()); //
//        Object o = list.get(0);
    }

    static void printNumberList(List<? extends Number> list) {
        for (Number item : list) {
            System.out.println(item);
        }
//        list.add("str");
//        list.add(new Object()); //
//        Object o = list.get(0);
    }

}


class Optional<T extends Number> {
    private T value;

    public Optional() {
    }

    public Optional(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T val) {
        value = val;
    }

}

// at runtime after type erasure Optional looks like:
class Optional2 {
    private Object value;

    public Optional2(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object val) {
        value = val;
    }

}

class IntegerOptional extends Optional<Integer> {

    public void setValue(Integer val) {

    }

}