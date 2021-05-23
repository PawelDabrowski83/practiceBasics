package pl.basics9.gui.cw10.ex01;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            () -> {
                JFrame jFrame = new JFrame();
                jFrame.setSize(800, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                String pathToFile = "files/ico/ets2_01.png";
                ImageIcon imageIcon = new ImageIcon(pathToFile);


                JLabel jLabel = new JLabel(imageIcon);
                JScrollPane jScrollPane = new JScrollPane(jLabel);
                jScrollPane.setPreferredSize(new Dimension(200, 200));
                jFrame.add(jScrollPane);




                jFrame.setVisible(true);
            }
        );
    }
}
