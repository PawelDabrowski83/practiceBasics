package pl.basics9.gui.w03.vehicles;

public class Car implements Vehicle{

    private int currentRange;

    public Car() {
        this.currentRange = 0;
    }

    @Override
    public void startEngine() {
        if(engineCheckTime(currentRange)) {
            System.out.println("pora na wizytę w serwisie");
        }
    }

    @Override
    public void move() {
        currentRange++;
    }
}
