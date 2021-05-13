package pl.basics9.gui.cw08.task2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            () -> {
                JFrame jFrame = new JFrame();
                jFrame.setSize(800, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setTitle("Prosty chat");

                GridBagLayout gbl = new GridBagLayout();
                jFrame.setLayout(gbl);

                GridBagConstraints gbc = new GridBagConstraints();

                JTextField jTextField = new JTextField();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.weighty = 0.75;
                gbc.fill = GridBagConstraints.BOTH;
                jFrame.add(jTextField, gbc);

                JTextArea jTextArea = new JTextArea();
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.weightx = 0.5;
                gbc.weighty = 0.25;
                




                jFrame.setVisible(true);
            }
        );
    }
}
