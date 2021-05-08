package pl.basics9.gui.cw06.task2;

public class LetterThread extends Thread {
    private int counter;
    private String message;

    public LetterThread(String message, String name) {
        this.message = message;
        super.setName(name);
    }

    public void run() {
        while(!isInterrupted()) {
            for (char c : message.toCharArray()) {
                System.out.println(getName() + " - " + c + " " + counter);
                counter++;
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}
