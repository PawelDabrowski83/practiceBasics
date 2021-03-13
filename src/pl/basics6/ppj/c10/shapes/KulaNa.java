package pl.basics6.ppj.c10.shapes;

public class KulaNa {

    private final double radius;

    public KulaNa(Square square) {
        double halfSide = square.getSide() / 2;
        double halfPrzekatna = (square.getSide() * Math.sqrt(2)) / 2;
        radius = Math.sqrt(halfSide * halfSide + halfPrzekatna * halfPrzekatna);
    }

    public KulaNa(Cyllinder cyllinder) {
        double cylRadius = cyllinder.getRadius();
        double halfHeight = cyllinder.getHeight() / 2.0;
        radius = Math.sqrt(cylRadius * cylRadius + halfHeight * halfHeight);
    }


    public double getRadius() {
        return radius;
    }
}
