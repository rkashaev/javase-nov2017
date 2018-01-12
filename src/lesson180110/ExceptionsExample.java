package lesson180110;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionsExample {

    public static void main(String[] args) {

        readFile();

    }

    public static void readFile() {
        try {
            Files.lines(Paths.get("./menotfound.txt"));
        } catch (IOException e) {
            //myBFDB.log("there was an error in somewhere " + e);
//            throw new MyCuteLittleUncheckedException(e);
//            e.printStackTrace();
        }

    }
}

class MyCuteLittleUncheckedException extends RuntimeException {

    public MyCuteLittleUncheckedException(Throwable cause) {
        super(cause);
    }
}
