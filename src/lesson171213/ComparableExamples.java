package lesson171213;

import java.util.Arrays;

public class ComparableExamples {

    public static void main(String[] args) {

        Comrade[] guys = {
                new Comrade("Tommy", 169),
                new Comrade("Tirion", 135),
                new Comrade("Freddie", 145),
                new Comrade("Ivan", 175),
                new Comrade("Vasya", 175),
                new Comrade("Fedor Mikhalych", 175),
        };

        System.out.println("Guys as they are:");
        for (Comrade guy : guys) {
            System.out.println(guy);
        }

        Arrays.sort(guys);

        System.out.println("Please stand up:");
        for (Comrade guy : guys) {
            System.out.println(guy);
        }
    }


}

class Comrade implements Comparable<Comrade> {
    String name;
    int height;
    int iq;

    public Comrade(String name, int height) {
        this.name = name;
        this.height = height;
        this.iq = 100;
    }


    @Override
    public int compareTo(Comrade o) {
        if (o == null) {
            return 1;
        }

        int res = height - o.height;
        if (res != 0) return res;

        res = name.compareToIgnoreCase(o.name);

        return res;
    }

    @Override
    public String toString() {
        return "Comrade{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}

