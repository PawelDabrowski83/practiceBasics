package pl.basics9.gui.w09.ex02;

import pl.basics9.gui.w09.ex01.MyColorPanel;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                Main::new
        );
    }

    public Main() {

        MyImagePanel mip = new MyImagePanel("files/ico/ScanImage20.jpg", 200);

        JScrollPane jsp = new JScrollPane(mip);
        jsp.setPreferredSize(
                new Dimension(400, 500)
        );


        this.add(jsp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
