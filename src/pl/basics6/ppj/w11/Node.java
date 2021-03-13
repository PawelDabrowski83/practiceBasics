package pl.basics6.ppj.w11;

public class Node {

    Node next;
    int val;

    public Node(int val) {
        this.val = val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", val=" + val +
                '}';
    }
}
