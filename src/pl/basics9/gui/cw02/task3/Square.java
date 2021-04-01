package pl.basics9.gui.cw02.task3;

public class Square implements Figure, Comparable<Square>{
    private int length;

    public Square(int length) {
        if(length > max) {
            throw new TooBigSquareException(max);
        }
        this.length = length;
    }

    @Override
    public int getArea() {
        return length * length;
    }

    @Override
    public int getPerimeter() {
        return length * 4;
    }

    @Override
    public int compareTo(Square o) {
        return this.getPerimeter() - o.getPerimeter();
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
