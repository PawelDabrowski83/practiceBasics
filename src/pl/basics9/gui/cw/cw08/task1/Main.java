package pl.basics9.gui.cw.cw08.task1;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            ()->{
                JFrame jFrame = new JFrame();
                jFrame.setSize(800, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                jFrame.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();

                JButton jButton1 = new JButton("Button 1");
                gbc.gridx = 0;
                gbc.gridy = 0;
                jFrame.add(jButton1, gbc);

                JButton jButton2 = new JButton("Button 2");
                gbc.gridx = 1;
                gbc.gridy = 0;
                jFrame.add(jButton2, gbc);

                JButton jButton3 = new JButton("Button 3");
                gbc.gridx = 2;
                gbc.gridy = 0;
                jFrame.add(jButton3, gbc);

                JButton jButton4 = new JButton("Button 4");
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.weightx = 0;
                gbc.gridwidth = 3;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                jFrame.add(jButton4, gbc);

                JButton jButton5 = new JButton("Button 5");
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.gridwidth = 2;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                jFrame.add(jButton5, gbc);

                JButton jButton6 = new JButton("Button 6");
                gbc.gridx = 1;
                gbc.gridy = 3;
                gbc.gridwidth = 1;
                jFrame.add(jButton6, gbc);

                JButton jButton7 = new JButton("Button 7");
                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.gridheight = 2;
                gbc.fill = GridBagConstraints.VERTICAL;
                jFrame.add(jButton7, gbc);




                jFrame.setVisible(true);
            }
        );
    }
}
