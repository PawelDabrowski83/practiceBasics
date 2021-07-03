package pl.basics9.gui.wyklad.w03.usb;

public class Computer {

    public void connect(USB usb) {
        usb.send(new byte[]{1});
        byte[] data = usb.receive();
        // czynności
    }
}
