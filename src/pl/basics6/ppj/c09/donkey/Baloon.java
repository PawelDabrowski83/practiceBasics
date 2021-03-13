package pl.basics6.ppj.c09.donkey;

public class Baloon {
    private static final float UPLIFT = (float) 6/7;

    private float volume;

    public Baloon() {
        this.volume = randomizeVolume();
    }

    private float randomizeVolume() {
        return (float) (Math.random() * 0.004 + 0.005);
    }

    public float getVolume() {
        return volume;
    }


    public double getLoad() {
        return volume * UPLIFT;
    }
}
