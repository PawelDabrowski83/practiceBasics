package pl.basics6.ppj.c12.rocket;

public class Main {

    public static void main(String[] args) {

        Rocket rocket = new Rocket("Soyuz", 0);

        while(!rocket.isReadyToLaunch()) {
            rocket.fillFuelTank();
        }
    }
}
