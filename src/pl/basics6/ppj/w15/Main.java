package pl.basics6.ppj.w15;

public class Main {
    public static void main(String[] args) {
        MyTree tree = new MyTree();

        tree.add(20);
        tree.add(10);
        tree.add(30);

//        tree.show();
        //================
        ArrayQueue aq1 = new ArrayQueue();

        aq1.enqueue("jeden");
        aq1.enqueue("dwa");
        aq1.enqueue("trzy");
        aq1.enqueue("cztery");

        while(!aq1.empty()) {
            System.out.println(aq1.dequeue());
        }
    }
}
