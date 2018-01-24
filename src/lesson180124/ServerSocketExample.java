package lesson180124;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {
    public static final int PORT = 10000;

    public static void main(String[] args) throws Exception {

        ServerSocket ssocket = new ServerSocket(PORT);

        System.out.println("Awaiting for client connection");

        Socket socket = ssocket.accept();

        System.out.println("Connected: " + socket);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            String str;
            while (!(str = br.readLine()).equals("bye")) {
                System.out.printf("%s: %s%n", socket, str);
            }
        }

//        try (ObjectInputStream ois = new ObjectInputStream(socket.getInputStream())) {
//            Cat c = (Cat) ois.readObject();
//            System.out.println("Received a cat: " + c);
//            Object s = ois.readObject();
//            System.out.println("Recevied an object " + s.getClass() + ": " + s);
//        }

        socket.close();
    }
}
