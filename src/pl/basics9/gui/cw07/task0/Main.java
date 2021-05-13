package pl.basics9.gui.cw07.task0;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            ()->{
                JFrame okno = new JFrame();
                okno.setSize(800, 600);
                okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JButton przycisk = new JButton();
                przycisk.setText("Przycisk");

                okno.add(przycisk);
                FlowLayout fl = new FlowLayout();
                fl.setAlignment(FlowLayout.LEFT);
                okno.setLayout(fl);

                okno.setVisible(true);
            }
        );


    }
}
