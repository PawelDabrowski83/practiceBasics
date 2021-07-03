package pl.basics9.gui.cw.cw03;

public class Box<T extends Number> {

    T wartosc;

    public Box(T wartosc) {
        this.wartosc = wartosc;
    }

    public void show() {
        System.out.println(wartosc);
    }

    public void calculate() {
        System.out.println(wartosc.doubleValue() * wartosc.doubleValue());
    }
}
