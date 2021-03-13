package pl.basics6.ppj.c12.detektor;

public class DetektorDymu {

    protected boolean isSmokeDetected;

    public boolean isSmokeDetected() {
        return isSmokeDetected;
    }

    public void setSmokeDetected(boolean smokeDetected) {
        isSmokeDetected = smokeDetected;
    }

    public void checkSmoke() throws Exception {
        if (isSmokeDetected) {
            throw new Alarm();
        }
        System.out.println("Jest bezpiecznie.");
    }
}
