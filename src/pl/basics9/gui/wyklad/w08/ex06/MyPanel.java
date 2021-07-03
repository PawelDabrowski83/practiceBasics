package pl.basics9.gui.wyklad.w08.ex06;

import java.awt.*;

public class MyPanel extends Panel {

    protected Color color;

    public MyPanel(Color color){
        this.setPreferredSize(
            new Dimension(150, 150)
        );
        this.color = color;
        this.setBackground(color);
    }
}
