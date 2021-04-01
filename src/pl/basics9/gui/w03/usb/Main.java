package pl.basics9.gui.w03.usb;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();

        computer.connect(mouse);

    }
}
