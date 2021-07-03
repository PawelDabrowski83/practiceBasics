package pl.basics9.gui.cw.cw09.ex01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
            () -> {
                displayAll();
            }
        );
    }

    private static void displayAll() {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lFirst = new JLabel("a: ");
        JLabel lSecond = new JLabel("b: ");
        JTextField fFirst = new MyTextField();


        JTextField fSecond = new MyTextField();

        JButton bSubmit = new JButton("a + b");

        jFrame.setLayout(
            new FlowLayout()
        );

        bSubmit.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textFFirst = fFirst.getText();
                        String textFSecond = fSecond.getText();





                    }
                }
        );

        jFrame.add(lFirst);
        jFrame.add(fFirst);
        jFrame.add(lSecond);
        jFrame.add(fSecond);
        jFrame.add(bSubmit);


        jFrame.setVisible(true);
    }
}
