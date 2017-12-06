package lesson171129;

/**
 * Created by student on 29/11/17.
 */
public class SingletonExample {
    public static void main(String[] args) {
        //Singleton s = new Singleton();

        Singleton s2 = Singleton.getInstance();
    }
}

class Singleton {

    private static Singleton myInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (myInstance == null) {
            myInstance = new Singleton();
        }
        return myInstance;
    }


}
