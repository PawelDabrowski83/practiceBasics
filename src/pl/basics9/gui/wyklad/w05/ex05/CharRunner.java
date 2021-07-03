package pl.basics9.gui.wyklad.w05.ex05;

public class CharRunner implements Runnable {

    private char ch;

    public CharRunner(char ch) {
        this.ch = ch;
    }


    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print(ch);
        }
    }
}
