package pl.basics9.gui.cw02.example;

import pl.basics9.gui.cw02.example.Osoba;

public class Sprzatacz extends Osoba {

    public Sprzatacz(String nazwisko) {
        super(nazwisko);
    }

    public int getPensja(){
        return 1000;
    }
}
