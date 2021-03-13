package pl.basics6.ppj.c10.shapes;

/*
Utwórz klase Walec z prywatnymi polami promien i wysokosc. Zainicjuj pola w
konstruktorze. Dodaj metode toString wyswietlajaca:
• pole powierzchni podstawy,
• objetosc walca
Przedstaw wykorzystanie tej klasy na przykładzie.
 */
public class Cyllinder {
    private final int radius;
    private final int height;

    public Cyllinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    @Override
    public String toString() {
        return  "Walec o promieniu: " + radius + " oraz wysokości: " + height + "\n" +
                "Pole podstawy: " + getBaseArea() + ", \nObjętość walca: " + getVolume();
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
