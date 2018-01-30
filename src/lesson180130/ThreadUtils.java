package lesson180130;

public interface ThreadUtils {
    static void sleepQuietly(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void unsafePrintln(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }
}
