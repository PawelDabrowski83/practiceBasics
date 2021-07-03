package pl.basics9.gui.wyklad.ex01;

import javax.swing.table.DefaultTableModel;

public class SimpleTableModel extends DefaultTableModel {

    @Override
    public int getRowCount() {
        return 10;
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int row, int column) {
        return (row +1) * (column + 1);
    }
}
