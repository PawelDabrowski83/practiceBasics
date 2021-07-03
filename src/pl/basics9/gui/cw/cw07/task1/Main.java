package pl.basics9.gui.cw.cw07.task1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            ()->{
                JFrame jFrame = new JFrame();
                jFrame.setSize(800,600);
                jFrame.setTitle("Hello World");
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                jFrame.setVisible(true);
            }
        );
    }
}
