package pl.basics9.gui.wyklad.w07.ex01;

import java.awt.*;

public abstract class Circle implements Runnable {

    protected int x, y;
    protected int vy;

    public Circle(int x, int y){
        this.x = x;
        this.y = y;

        vy = (int)(Math.random() * 3);
        new Thread(this).start();
    }

    public void draw(Graphics g) {
        g.drawOval(x, y, 50, 50);
    }

//    @Override
//    public void run() {
//        do{
//            y += vy;
//            try {
//                Thread.sleep(200);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        } while(!Thread.currentThread().isInterrupted());
//    }

    abstract public void run();
}
