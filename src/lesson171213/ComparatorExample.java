package lesson171213;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {

    public static final FioComparator FIO_COMPARATOR = new FioComparator();
    public static final StreetComparator STREET_COMPARATOR = new StreetComparator();
    public static final HouseComparator HOUSE_COMPARATOR = new HouseComparator();

    public static void main(String[] args) {
        Employee[] guys = giveMePleaseSomeGuys();

        Arrays.sort(guys, FIO_COMPARATOR);

        System.out.println("Guys after FIO_COMPARATOR:");
        for (Employee guy : guys) {
            System.out.println(guy);
        }

        Arrays.sort(guys, STREET_COMPARATOR);

        System.out.println("Guys after STREET_COMPARATOR:");
        for (Employee guy : guys) {
            System.out.println(guy);
        }

        Arrays.sort(guys, new BiComparator(STREET_COMPARATOR, HOUSE_COMPARATOR));

        System.out.println("Guys after BiComparator:");
        for (Employee guy : guys) {
            System.out.println(guy);
        }

        Arrays.sort(guys, (o1, o2) -> o1.street.compareTo(o2.street));

    }

    private static Employee[] giveMePleaseSomeGuys() {
        return new Employee[]{
                new Employee("Иванов", "Айван", "Ленина", "1Б", 1),
                new Employee("Иванов", "Петр", "Ленина", "1Б", 2),
                new Employee("Федоров", "Василий", "Ленина", "1", 3),
                new Employee("Пупкин", "Василий", "Сумская", "6", 5),
                new Employee("Мимикин", "Владислав", "Зои и Александра Космодемьянских", "1", 3),
                new Employee("Бурчанский", "Ипполит", "Зои и Александра Космодемьянских", "3", 4),
                new Employee("Егоров", "Семен", "Зои и Александра Космодемьянских", "5", 30),
                new Employee("Дураков", "Витя", "Трубецкая", "1", 3),
                new Employee("Щедве", "Григорий", "Невский проспект", "81", 1),
                new Employee("Николайчик", "Изя", "Трубецкая", "1", 3),
        };
    }
}


class Employee {
    String fa;
    String im;

    String street;
    String house;
    int flat;

    public Employee(String fa, String im, String street, String house, int flat) {
        this.fa = fa;
        this.im = im;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{ ");
        sb.append(fa).append(", ");
        sb.append(im).append(" - ");
        sb.append(street).append(',');
        sb.append(house).append(',');
        sb.append(flat);
        sb.append('}');
        return sb.toString();
    }
}

class FioComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // null checks are suppressed here

        int res = o1.fa.compareTo(o2.fa); // o1.fa should be null checked also, skipped
        if (res != 0) return res;

        res = o1.im.compareTo(o2.im);

        return res;
    }
}

class StreetComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // null checks are suppressed here

        return o1.street.compareTo(o2.street);
    }
}

class HouseComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        // null checks are suppressed here

        int res = o1.house.compareTo(o2.house);
        if (res != 0) return res;

        res = - o1.flat + o2.flat;

        return res;
    }
}

class BiComparator implements Comparator<Employee> {
    Comparator<Employee> c1;
    Comparator<Employee> c2;

    public BiComparator(Comparator<Employee> c1, Comparator<Employee> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        int res = c1.compare(o1, o2);
        if (res != 0) return res;

        res = c2.compare(o1, o2);

        return res;
    }
}
