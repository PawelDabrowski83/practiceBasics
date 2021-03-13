package pl.basics6.ppj.c12.detektor;

public class Main {
    public static void main(String[] args) {

        DetektorDymu detektorDymu = new DetektorDymu();
        try {
            detektorDymu.checkSmoke();
        } catch (Exception exception) {
            System.out.println("Alarm ppoż.");
        }
        detektorDymu.setSmokeDetected(true);
        try {
            detektorDymu.checkSmoke();
        } catch (Exception exception) {
            System.out.println("Alarm ppoż.");
        }
    }
}
