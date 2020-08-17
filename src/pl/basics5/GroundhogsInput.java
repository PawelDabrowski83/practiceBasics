package pl.basics5;

public class GroundhogsInput {
    private final boolean isWeekend;
    private final int cups;

    public GroundhogsInput(boolean isWeekend, int cups) {
        this.isWeekend = isWeekend;
        this.cups = cups;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public int getCups() {
        return cups;
    }
}
