package pl.basics9.gui.w01.persons;

public class MyList<T extends Person> {

    protected Element head;

    public MyList(){
        this.head = null;
    }

    public void add(T t) {
        if (head == null) {
            head = new Element(t);
        } else {
            head = new Element(t, head);
        }
    }

    public void show() {
        Element tmp = head;
        while(tmp != null) {
            System.out.println(tmp.t.getDesc());
            tmp = tmp.next;
        }
    }
}
