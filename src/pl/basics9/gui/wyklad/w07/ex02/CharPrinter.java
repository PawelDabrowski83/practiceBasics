package pl.basics9.gui.wyklad.w07.ex02;

public class CharPrinter extends Thread {

    private char ch;
    private Thread next;
    private static Object obj = new Object();

    public CharPrinter(char ch) {
        this.ch = ch;
    }

    public void setNext(Thread t){
        this.next = t;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                synchronized (this) {
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (obj) {
                    System.out.print(ch);
            }

            if (next != null) {
                synchronized (next) {
                    next.notify();
                }
            }
        }
    }
}
