package pl.basics9.gui.w08.ex06;

import java.awt.*;
import java.util.EventObject;

public class ColorEvent extends EventObject {

    private Color color;

    public ColorEvent(Object source, Color color) {
        super(source);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
