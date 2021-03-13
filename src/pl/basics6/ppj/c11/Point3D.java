package pl.basics6.ppj.c11;

public class Point3D extends Point2D {

    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double getDistance(Point3D target) {
        return Math.sqrt(Math.pow(target.getX() - this.getX(), 2) + Math.pow(target.getY() - this.getY(), 2) + Math.pow(target.getZ() - this.getZ(), 2));
    }
}
