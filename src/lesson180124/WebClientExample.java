package lesson180124;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class WebClientExample {
    public static void main(String[] args) throws Exception {

        Socket s = new Socket("horstmann.com", 80);
        try (PrintStream ps = new PrintStream(s.getOutputStream())) {
            ps.println("GET / HTTP/1.1");
            ps.println("Host: www.horstmann.com");
            ps.println();
            ps.flush();

            try (BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
                String str;
                while ((str = br.readLine()) != null) {
                    System.out.println(str);
                }
            }
            s.close();

        }

    }
}
