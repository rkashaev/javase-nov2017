package lesson171220;

public class Formatters {
    public static void main(String[] args) {
        Cat c1 = new Cat("Mary", "Peter", "default", 5, 12.23);

        System.out.println(c1.getOldString());
        System.out.println(c1.getString());
    }
}

class Cat {
    String name;
    String owner;
    String specie;
    int age;
    double weight;

    public Cat(String name, String owner, String specie, int age, double weight) {
        this.name = name;
        this.owner = owner;
        this.specie = specie;
        this.age = age;
        this.weight = weight;
    }

    public String getOldString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", specie='" + specie + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                " kg}";
    }

    public String getString() {
        return String.format("Cat{name='%s', owner='%s', " +
                        "specie='%s', age=%03d, weight=%5.2f kg}", name, owner, specie, age, weight);
    }
}
