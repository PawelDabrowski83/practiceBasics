package pl.basics9.gui.cw10.ex02;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MyTableModel extends AbstractTableModel {

    private final List<Book> bookList;

    public MyTableModel(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public int getRowCount() {
        return bookList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex){
            case 0 -> bookList.get(rowIndex).getAuthorFirstName();
            case 1 -> bookList.get(rowIndex).getAuthorLastName();
            case 2 -> bookList.get(rowIndex).getTitle();
            case 3 -> bookList.get(rowIndex).getPrice();
            default -> throw new IllegalStateException();
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return (columnIndex == 3);
    }
}
