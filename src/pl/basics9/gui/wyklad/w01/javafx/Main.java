package pl.basics9.gui.wyklad.w01.javafx;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        setSize(640, 480);
        setVisible(true);

        addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);
                        System.exit(0);
                    }
                }
        );

        addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        super.mouseClicked(e);
                        System.out.println(e.getX() + " " + e.getY());
                    }
                }
        );
    }

    interface C {
        public void go();
    }

    abstract class A implements C {

    }

    class B extends A {
        @Override
        public void go() {

        }
    }
}

