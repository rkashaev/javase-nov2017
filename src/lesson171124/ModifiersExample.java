package lesson171124;

/**
 * Created by student on 24/11/17.
 */
public class ModifiersExample {
    static int here;

    public static void primitiveTypes() {
        int a = 1023123;
        short b = (short) 102300;
        short c = 0;

        int сколькоМоейБабушкеЛет = 0;

        long d = 1000_000_0000L;


        char l1 = '\'';
        char l2 = '\r';
        char l3 = '\n';
        char l4 = '\t';



    }



    public static void main(String[] args) {

        int count = 0;

        Person p;

        //x

        count = count + 1;


        p = new Person("vasya", "pupkin", 19);

        Person a = p;

        a.setName("vasya2");

        // ..
        p = new Person("petya", "pupkin", 21);

        primitiveTypes();

        if (true) {
            String hello = "";
            int t = 0;

            for (;;) {
                int count2 = 0;
            }
        }

        while(true) {
            Person newPerson = new Person();
            //...
        }



    }
}

// POJO - Plain old java object
class Person {
    private String name;
    private String surname;

    private byte b1;
    private int age;
    private short b2;

    int height;
    //...


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (name != person.name) return false;
        //..
        return true;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }
}