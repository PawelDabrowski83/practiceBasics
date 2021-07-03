package pl.basics9.gui.cw.cw06.task3;

public class StringTask implements Runnable {

    private final String initialText;
    private String resultText;
    private int repeats;
    private int loops = 0;
    private TaskStateEnum currentState;

    public StringTask(String text, int repeats) {
        this.initialText = text;
        this.resultText = text;
        this.repeats = repeats;
        this.currentState = TaskStateEnum.CREATED;
    }

    @Override
    public void run() {
        currentState = TaskStateEnum.RUNNING;

        while(!Thread.currentThread().isInterrupted()){
            while(repeats > loops++) {
                getResult();
            }
        }
    }

    public String getResult() {
        if (repeats > loops) {
            resultText += initialText;
        } else {
            currentState = TaskStateEnum.READY;
            System.out.println("Loops: " + loops + " / " + repeats);
        }
        return resultText;
    }

    public TaskStateEnum getState() {
        return currentState;
    }

    public void start() {
//        getResult();
        Thread thread = new Thread(this);
        thread.start();
    }

    public void abort() {
        currentState = TaskStateEnum.ABORTED;
        Thread.currentThread().interrupt();
    }

    public boolean isDone() {
        return !Thread.currentThread().isAlive();
    }
}
