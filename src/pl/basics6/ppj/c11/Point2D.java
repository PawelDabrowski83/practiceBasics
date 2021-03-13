package pl.basics6.ppj.c11;

public class Point2D {
    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistance(Point2D target) {
        return Math.sqrt(Math.pow(target.getX() - this.getX(), 2)+Math.pow(target.getY() - this.getY(), 2));
    }
}
