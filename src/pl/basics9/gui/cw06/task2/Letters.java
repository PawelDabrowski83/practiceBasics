package pl.basics9.gui.cw06.task2;

import java.util.ArrayList;
import java.util.List;

public class Letters {
    private final String message;
    private final int threadCount;
    private final List<Thread> threads = new ArrayList<>();

    public Letters(String message, int threads) {
        this.message = message;
        this.threadCount = threads;
        generateThreads(threadCount);
    }

    private void generateThreads(int counter) {
        while (counter-- > 0) {
            Thread thread = new LetterThread(message, "Thread" + counter);
            threads.add(thread);
        }
    }

    public List<Thread> getThreads() {
        return threads;
    }
}
