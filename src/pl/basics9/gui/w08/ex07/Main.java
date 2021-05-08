package pl.basics9.gui.w08.ex07;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*
        EventQueue.invokeLater(
            ()->{
                JFrame jFrame = new JFrame();
                jFrame.setVisible(true);
            }
        );
        */

        SwingUtilities.invokeLater(
                ()->{
                    JFrame jFrame = new JFrame();
                    /*
                    jFrame.setLayout(new FlowLayout());

                    for (int i=0; i<10; i++){
                        JButton jb = new JButton("Button " + i);
                        jFrame.add(jb);
                    }

                     */

                    jFrame.setLayout(new BorderLayout());
                    jFrame.add(new JButton("North"), BorderLayout.NORTH);
                    jFrame.add(new JButton("East"), BorderLayout.EAST);
                    jFrame.add(new JButton("West"), BorderLayout.WEST);
                    jFrame.add(new JButton("South"), BorderLayout.SOUTH);
                    jFrame.add(new JButton("Center"), BorderLayout.CENTER);


                    jFrame.setTitle("MyFirstSWING componen");
                    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                    jFrame.setVisible(true);

                    jFrame.pack();
                }
        );
    }
}
