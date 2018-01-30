package lesson180130;

import static lesson180130.ThreadUtils.sleepQuietly;
import static lesson180130.VisibilityExample.MY_INT;

public class VisibilityExample {

    static volatile int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }
}


class ChangeListener extends Thread {
    @Override
    public void run() {
        int local_value = MY_INT;
        while ( local_value < 5){
            if( local_value!= MY_INT){
                System.out.printf("Got Change for MY_INT : %d%n", MY_INT);
                local_value= MY_INT;
            }
        }
    }
}

class ChangeMaker extends Thread{
    @Override
    public void run() {

        int local_value = MY_INT;
        while (MY_INT <5){
            System.out.printf("Incrementing MY_INT to %d%n", MY_INT);
            MY_INT = ++local_value;
            sleepQuietly(500);
        }
    }
}