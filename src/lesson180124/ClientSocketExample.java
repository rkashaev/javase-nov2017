package lesson180124;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.time.LocalDate;

public class ClientSocketExample {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("localhost", 10000);

        Cat cat = new Cat("Kitty kitty", LocalDate.now());

        try (ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream())) {
            oos.writeObject(cat);
            oos.writeObject("Fine");
        }

        System.out.println("The cat has been sent: " + cat);
    }
}
