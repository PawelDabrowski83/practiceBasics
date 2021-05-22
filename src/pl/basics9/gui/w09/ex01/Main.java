package pl.basics9.gui.w09.ex01;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        MyColorPanel mcp = new MyColorPanel();

        JScrollPane jsp = new JScrollPane(mcp);
        jsp.setPreferredSize(
            new Dimension(400, 500)
        );


        this.add(jsp);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
