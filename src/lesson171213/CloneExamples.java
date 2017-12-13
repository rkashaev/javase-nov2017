package lesson171213;

import java.util.Arrays;

public class CloneExamples {
    public static void main(String[] args) throws CloneNotSupportedException {

        Sheep sh1 = new Sheep("Dolly", 1, 1);

        Sheep clone1 = sh1.clone();

        // shallow copy preserves old references
        System.out.println(sh1.name == clone1.name);
        System.out.println(sh1.age == clone1.age);
        System.out.println(sh1.weight == clone1.weight);

        sh1.genome[1] = 3;

        System.out.println(sh1);
        System.out.println(clone1);
    }
}

class Sheep implements Cloneable {
    String name;
    int age;
    Integer weight;
    int[] genome = {1 ,2};

    public Sheep(String name, int age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", genome=" + Arrays.toString(genome) +
                '}';
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        Sheep clone = (Sheep) super.clone();

        clone.genome = genome.clone();

        return clone;
    }
}