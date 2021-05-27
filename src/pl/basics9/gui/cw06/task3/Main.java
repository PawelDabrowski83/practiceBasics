package pl.basics9.gui.cw06.task3;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        StringTask task = new StringTask("A", 100000);
        System.out.println("Task " + task.getState());
        task.start();


        while(!task.isDone()) {
            Thread.sleep(500);

            switch (task.getState()) {
                case RUNNING -> System.out.print("R.");
                case ABORTED -> System.out.println("ABORTED");
                case READY -> System.out.println(" ... ready");
                default -> System.out.println("Unknown state");
            }

            System.out.println("Task " + task.getState());
            System.out.println(task.getResult().length());
        }

    }
}
