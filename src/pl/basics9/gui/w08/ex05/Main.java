package pl.basics9.gui.w08.ex05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {

    public static void main(String[] args) {
        new Main();
    }

    public Main(){

        Button button = new Button("click me");

        button.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Click");
                    }
                }
        );

        this.addWindowListener(
            new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                    System.exit(0);
                }
            }
        );

        setLayout(new FlowLayout());
        add(button);

        setSize(640, 480);
        setVisible(true);
    }
}
