package pl.basics6.ppj.w15;

public class ArrayQueue {

    private String[] queue;
    private int count;

    public ArrayQueue() {
        this.queue = new String[10];
        this.count = 0;
    }

    public void enqueue(String str) {
        this.queue[count++] = str;
    }

    public String dequeue() {
        return this.queue[--count];
    }

    public boolean empty() {
        return this.count == 0;
    }
}
