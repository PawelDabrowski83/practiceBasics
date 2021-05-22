package pl.basics9.gui.w10.ex01;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class GradeRenderer extends JPanel implements TableCellRenderer {

    private double grade;
    private JLabel lGrade;

    public GradeRenderer(){
        this.lGrade = new JLabel("none");
        this.setLayout(new FlowLayout());
        this.add(this.lGrade);
    }

    public void setGrade(double value) {
        this.grade = value;
        this.lGrade.setText("" + value);
        this.setBackground(
            grade < 4 ? Color.RED : Color.GREEN
        );
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setGrade((Double) value);
        return this;
    }
}
