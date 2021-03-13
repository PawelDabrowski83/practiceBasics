package pl.basics6.ppj.c10.shapes;

/*
I. Utwórz klase Kwadrat z prywatnym polem bok. Zainicjuj pole w konstruktorze. Dodaj
metode toString wyswietlajaca:
• pole powierzchni tego kwadratu,
• objetosc szescianu zbudowanego na podstawie tego kwadratu
Przedstaw wykorzystanie tej klasy na przykładzie.
 */
public class Square {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getVolume() {
        return getArea() * side;
    }

    @Override
    public String toString() {
        return  "Kwadrat o boku: " + side + "\n" +
                "Pole powierzchni: " + getArea() + "\n" +
                "Objętość sześcianu: " + getVolume();
    }

    public double getSide() {
        return side;
    }
}
