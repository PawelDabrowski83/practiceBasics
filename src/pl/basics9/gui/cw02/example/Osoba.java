package pl.basics9.gui.cw02.example;

public abstract class Osoba {
    String nazwisko;

    public Osoba(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public abstract int getPensja();
}
