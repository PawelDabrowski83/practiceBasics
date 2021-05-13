package pl.basics9.gui.cw07.task2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            ()->{
                JFrame jFrame = new JFrame();
                jFrame.setSize(800, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                jFrame.setLayout(new FlowLayout());

                addJTextArea(jFrame);



                jFrame.setVisible(true);
            }
        );
    }

    public static void addJTextArea(JFrame jFrame){

        JTextArea jTextArea = new JTextArea();
        jTextArea.setBackground(Color.CYAN);
        jTextArea.setCaretColor(Color.BLUE);
        jTextArea.setFont(Font.getFont(Font.SERIF));

        jFrame.add(jTextArea);
    }
}
