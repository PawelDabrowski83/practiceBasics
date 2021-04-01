package pl.basics9.gui.w01.persons;

public class Element<T extends Person> {

    protected T t;
    protected Element<T> next;

    public Element(T t) {
        this.t = t;
        this.next = null;
    }

    public Element(T t, Element<T> element) {
        this.t = t;
        this.next = element;
    }

}
