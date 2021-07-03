package pl.basics9.gui.cw.cw10.ex01;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static int imageCounter;

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            () -> {
                JFrame jFrame = new JFrame();
                jFrame.setSize(800, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.setLayout(new FlowLayout());


                String pathToFile = getNextImage();
                ImageIcon imageIcon = new ImageIcon(pathToFile);

                JButton jButton = new JButton("Show next image");
                jButton.setPreferredSize(new Dimension(200, 50));
                jFrame.add(jButton);




                JLabel jLabel = new JLabel(imageIcon);
                JScrollPane jScrollPane = new JScrollPane(jLabel);
                jScrollPane.setPreferredSize(new Dimension(400, 400));
                jFrame.add(jScrollPane);

                jButton.addActionListener(
                    e -> jLabel.setIcon(new ImageIcon(getNextImage()))
                );

                jFrame.setVisible(true);
            }
        );
    }

    private static String getNextImage() {
        String path = "";
        switch (imageCounter++) {
            case 0 -> path = "files/ico/ets2_01.png";
            case 1 -> path = "files/ico/ets2_02.png";
            case 2 -> {
                path = "files/ico/ets2_03.png";
                imageCounter = 0;
            }
        }
        return path;
    }
}
