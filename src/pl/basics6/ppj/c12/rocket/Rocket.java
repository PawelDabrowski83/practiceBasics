package pl.basics6.ppj.c12.rocket;

public class Rocket {

    public static final int SINGLE_FUEL_FILL_LIMIT = 1000;
    public static final int FUEL_REQUIRED_TO_LAUNCH = 1000;

    protected String name;
    protected int fuelWeight;

    public Rocket(String name, int fuelWeight) {
        this.name = name;
        this.fuelWeight = fuelWeight;
    }

    public boolean isReadyToLaunch() {
        try {
            prepareLaunch();
            this.fuelWeight -= FUEL_REQUIRED_TO_LAUNCH;
            System.out.println("Rocket launched!");
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return false;
    }

    public int getFuelWeight() {
        return fuelWeight;
    }

    public void fillFuelTank() {
        int fuelAmount = getRandomFuel();
        System.out.println("Tanking with " + fuelAmount + " litres of rocket fuel.");
        this.fuelWeight += fuelAmount;
    }

    private int getRandomFuel() {
        return (int) (Math.random() * SINGLE_FUEL_FILL_LIMIT);
    }

    public void prepareLaunch() throws Exception {
        if (fuelWeight < FUEL_REQUIRED_TO_LAUNCH) {
            throw new Exception("Rocket launch cancelled - not enough fuel.");
        }
    }
}
