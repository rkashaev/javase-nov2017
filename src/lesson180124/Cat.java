package lesson180124;

import java.io.Serializable;
import java.time.LocalDate;

public class Cat implements Serializable {
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
