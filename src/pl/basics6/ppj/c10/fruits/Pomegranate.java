package pl.basics6.ppj.c10.fruits;

public class Pomegranate extends Fruit {
    private int seedCount;

    public Pomegranate(String name, int seedCount) {
        super(name);
        this.seedCount = seedCount;
    }

    public String toString() {
        return super.toString() +
                "\nseedCount: " + seedCount;
    }
}
