package pl.basics9.gui.cw06;

import static java.lang.Thread.interrupted;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i< 100; i ++) {
                    System.out.println("Thread: " + i);
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            }
        };
        t1.start();

        try {
            sleep(5000);
            t1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 100; i> 0; i --) {
            System.out.println("Main: " + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}
