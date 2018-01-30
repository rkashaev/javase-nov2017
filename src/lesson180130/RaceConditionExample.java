package lesson180130;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

import static lesson180130.ThreadUtils.unsafePrintln;
import static lesson180130.ThreadUtils.sleepQuietly;


public class RaceConditionExample {
    static int count = 0;
    static Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {

//        Thread walkerThread = new Thread(new Walker());
//        Talker talkerThread = new Talker();

//        talkerThread.start();
//        walkerThread.start();

        Lock lock = new ReentrantLock();


        Runnable counter = new Runnable() {
            @Override
            public void run() {
                System.out.printf("Thread %s started%n", Thread.currentThread().getName());
                for (int i = 0; i < 1000; i++) {
                    synchronized (monitor) {
                        count++;
                    }

                    sleepQuietly(1);
                }
            }
        };


        Thread c1 = new Thread(counter);
        Thread c2 = new Thread(counter);

        c1.start();
        c2.start();

        c1.interrupt();
        c1.isInterrupted();
        //c1.interrupted();

        c1.join();
        c2.join();

        System.out.println("Total count " + count);


        Object acc1 = new Object();
        Object acc2 = new Object();

        synchronized (acc1) {
            acc1.wait();
        }
        /// ---
        synchronized (acc1) {
            acc1.notify();
        }


    }
}


class Walker implements Runnable {
    @Override
    public void run() {

        IntStream.range(0, 100).forEach(i -> {
            unsafePrintln("Modern");
            sleepQuietly(10);
        });

    }


}

class Talker extends Thread {

    @Override
    public void run() {

        IntStream.range(0, 100).forEach(i -> {
            unsafePrintln("Talking");
            sleepQuietly(10);
        });

    }
}