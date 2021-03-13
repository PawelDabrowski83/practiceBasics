package pl.basics6.ppj.c10.shapes;

/*
Zdefiniuj klase KulaW, z dwoma konstruktorami przyjmujacymi jako parametry odpowiednio
obiekty klas Walec i Kwadrat (obie klasy zdefiniowane na cwiczeniach 16).
Pola tej klasy zostana zainicjowane takimi wartosciami, aby bryła ta miesciła sie
odpowiednio w bryle walca lub szescianu zaleznie od wywołanego konstruktora.
 */
public class KulaW {
    private final double radius;

    public KulaW(Square square) {
        radius = square.getSide() / 2;
    }

    public KulaW(Cyllinder cyllinder) {
        radius = cyllinder.getRadius() * 2 > cyllinder.getHeight() ? cyllinder.getHeight() / 2.0 : cyllinder.getRadius() ;
    }

}
