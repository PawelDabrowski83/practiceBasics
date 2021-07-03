package pl.basics9.gui.wyklad.w07.ex03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService es1 = //Executors.newSingleThreadExecutor();
                //Executors.newFixedThreadPool(10);
                Executors.newScheduledThreadPool(10);

        es1.submit(
            new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 20; i++){
                        System.out.print('a');
                    }
                }
            }
        );

        es1.submit(
            () -> {
                for (int i = 0; i < 20; i++){
                    System.out.print('b');
                }
            }
        );

        es1.shutdown();
    }
}
