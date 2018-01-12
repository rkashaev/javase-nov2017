package lesson171227;

import java.io.*;

public class FinallyExample {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {

            fis = new FileInputStream("....sdfsdfsdf");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeQuietly(fis);
        }

        try (InputStreamReader isr = new InputStreamReader(fis)) {
            // sdfsdf

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void closeQuietly(Closeable fis) {
        if (fis == null) {
            return;
        }
        try {
            fis.close();
        } catch (IOException e) {
            System.out.println("Error closing the resourse " + fis);
            e.printStackTrace();
        }
    }
}
