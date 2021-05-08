package pl.basics9.gui.cw06.task2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD", 4);
        for (Thread t : letters.getThreads()) {
            System.out.println(t.getName());
        }

        for (Thread t : letters.getThreads()) {
            t.start();
        }

        System.out.println("Usypianie Maina");
        Thread.sleep(5000);

        for (Thread t : letters.getThreads()) {
            t.interrupt();
        }


        System.out.println("Program zakończył działanie");
    }
}
