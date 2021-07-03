package pl.basics9.gui.wyklad.w03.usb;

public interface USB {

    void send(byte[] data);
    byte[] receive();
}
