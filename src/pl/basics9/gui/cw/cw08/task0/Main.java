package pl.basics9.gui.cw.cw08.task0;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                ()->{
                    JFrame jFrame = new JFrame();
                    jFrame.setSize(800, 600);
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//                    FlowLayout fl = new FlowLayout();
//                    fl.setAlignment(FlowLayout.LEFT);
//                    jFrame.setLayout(fl);

                    GridBagLayout gbl = new GridBagLayout();
                    jFrame.setLayout(gbl);

                    GridBagConstraints gbc = new GridBagConstraints();


                    JButton jButton = new JButton();
                    jButton.setText("Hello");

                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    jFrame.add(jButton, gbc);

                    JButton jButton2 = new JButton();
                    jButton2.setText("Hoooooo");;

                    gbc.gridx = 1;
                    gbc.gridy = 0;

                    jFrame.add(jButton2, gbc);

                    JButton jButton3 = new JButton();
                    jButton3.setText("Sample text-");;
                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    gbc.gridwidth = 2;
                    gbc.fill = GridBagConstraints.BOTH;
                    gbc.weightx = 1;
                    gbc.weighty = 1;

                    jFrame.add(jButton3, gbc);



//                    jButton.addActionListener(new ActionListener() {
//                        @Override
//                        public void actionPerformed(ActionEvent e) {
//                            System.out.println("Hello");
//                        }
//                    });
                    jButton.addActionListener(
                            (event) -> {
                                System.out.println("Hello");
                            }
                    );

                    jFrame.setVisible(true);
                }
        );
    }
}
