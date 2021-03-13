package pl.basics6.ppj.w11;

public class MyStack {

    final int SIZE = 3;
    int[] arr;
    int fill;

    public MyStack() {
        arr = new int[SIZE];
        fill = 0;
    }

    public void push(int val) throws Exception {
        if (fill < SIZE) {
            arr[fill++] = val;
        } else {
            throw new Exception("Stack is full");
        }

    }

    public int pop() {
        return arr[--fill];
    }
}
