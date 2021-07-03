package pl.basics9.gui.wyklad.w07.ex04;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();

        Future<String> future = es.submit(
            new Callable<String>() {
                @Override
                public String call() throws Exception {
                    Thread.sleep(2000);
                    return "result value";
                }
            }
        );

        try {
            System.out.println("wyniki " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
    }
}
