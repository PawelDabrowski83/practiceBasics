package pl.basics9.gui.cw10.ex02;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            () -> {
                JFrame jFrame = new JFrame("Books");
                jFrame.setSize(800, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




                jFrame.setVisible(true);
            }
        );
    }
}
