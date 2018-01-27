package lesson180126;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExamples {
    public static void main(String[] args) {
        Consumer<String> c = (String s) -> System.out.println(s);

        List<Cat> cats = Arrays.asList(
                new Cat("Kitty", LocalDate.of(2005, 3, 12)),
                new Cat("Mitty", LocalDate.of(2006, 4, 13)),
                new Cat("Pitty", LocalDate.of(2007, 5, 14)),
                new Cat("Fitty", LocalDate.of(2008, 6, 22))
        );
        final LocalDate now = LocalDate.now();

        List<Cat> newCats = new ArrayList<>(cats);

        newCats.removeIf(cat -> Period.between(cat.dateBirth, now).getYears() > 10);

        newCats.forEach(cat -> System.out.println(cat));

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<String> strings = convert(ints, a -> String.valueOf(a));

    }

    static List<String> convert(List<Integer> list, Function<Integer, String> func) {
        List<String> res = new ArrayList<>(list.size());

        for (Integer o : list) {
            res.add(func.apply(o));
        }

        return res;
    }


    static List<Cat> filterCats(List<Cat> cats, Predicate<Cat> tester) {
        List<Cat> newCats = new ArrayList<>();
        for (Cat cat : cats) {
            if (tester.test(cat)) {
                newCats.add(cat);
            }
        }
        return newCats;
    }
}

class CatAgeTester implements Predicate<Cat> {
    private int years;

    public CatAgeTester(int years) {
        this.years = years;
    }

    public boolean test(Cat cat) {
        final LocalDate now = LocalDate.now();
        Period age = Period.between(cat.dateBirth, now);

        return age.getYears() <= years;
    }
}



class Cat implements Serializable {
    String name;
    LocalDate dateBirth;

    public Cat(String name, LocalDate dateBirth) {
        this.name = name;
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
