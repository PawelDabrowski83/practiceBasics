package pl.basics6.ppj.w11;

public class MyList {

    Node head;

    public MyList() {
        head = null;
    }

    public void add(int val) {
        Node tmp = new Node(val);

        if (head == null) {
            head = tmp;
        } else {
            Node headCopy = head;
            while (headCopy.getNext() != null) {
                headCopy = headCopy.getNext();
            }
            headCopy.setNext(tmp);
        }
    }

    public void insert(int index, int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
        } else {
            Node tmp = head;

            int i = 0;
            while (tmp.getNext() != null && i + 1 < index) {
                tmp = tmp.getNext();
                i++;
            }
            node.setNext(tmp.getNext());
            tmp.setNext(node);
        }
    }

    public void show() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.getNext();
        }
    }
}
