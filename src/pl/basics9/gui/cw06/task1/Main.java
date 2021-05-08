package pl.basics9.gui.cw06.task1;

public class Main {
    public static void main(String[] args) {

        Thread t1 = new Thread(){
            public void run(){
                for (int i = 0; i < 11; i++) {
                    System.out.println("Thread1: " + i);
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for (int i = 0; i < 11; i++) {
                    System.out.println("Thread2: " + i);
                }
            }
        };

        Thread t3 = new Thread(){
            public void run(){
                for (int i = 0; i < 11; i++) {
                    System.out.println("Thread3: " + i);
                }
            }
        };

        Thread t4 = new Thread(){
            public void run(){
                for (int i = 0; i < 11; i++) {
                    System.out.println("Thread4: " + i);
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
