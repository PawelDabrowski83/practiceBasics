package pl.basics9.gui.w05.ex05;

public class CharPrinter extends Thread {

    private char ch;
    private static Object obj = new Object();

    public CharPrinter(char ch) {
        this.ch = ch;
    }


    public void run() {
        synchronized (obj) {
            for (int i = 0; i < 20; i++) {
                System.out.print(ch);
            }

        }
    }
}
