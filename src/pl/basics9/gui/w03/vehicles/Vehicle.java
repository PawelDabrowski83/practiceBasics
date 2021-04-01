package pl.basics9.gui.w03.vehicles;

public interface Vehicle {

    int MAX_SPEED = 140;

    void startEngine();
    void move();

    default boolean engineCheckTime(int km) {
        return km >= 10000;
    }
}
