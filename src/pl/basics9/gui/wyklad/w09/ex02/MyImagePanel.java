package pl.basics9.gui.wyklad.w09.ex02;

import javax.swing.*;
import java.awt.*;

public class MyImagePanel extends JPanel {

    private ImageIcon ii;

    public MyImagePanel(String path, double height) {
        this.ii = new ImageIcon(path);

        double prop = height / ii.getIconHeight();
        this.ii = new ImageIcon(
                ii.getImage().getScaledInstance(
                        (int) (ii.getIconWidth() * prop),
                        (int) (height),
                        Image.SCALE_SMOOTH)
        );



        this.setPreferredSize(
            new Dimension(
                this.ii.getIconWidth(), this.ii.getIconHeight()
            )
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        ii.paintIcon(this, g, 0, 0);
    }
}
