package pl.basics9.gui.wyklad.ex01;

import pl.basics9.gui.wyklad.w09.ex02.MyImagePanel;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class ImageRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        MyImagePanel mip = new MyImagePanel(
            "ścieżka do katalogu z ikonami" + value + ".jpg", 50
        );
        return mip;
    }
}
