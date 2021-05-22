package pl.basics9.gui.w10.ex01;

import javax.swing.*;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Main extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                Main::new
        );
    }

    public Main() {

        StudentModel sm = new StudentModel();

        JTable jTable = new JTable();
        jTable.setModel(sm);

        jTable.setDefaultRenderer(Double.class, new GradeRenderer());
        jTable.setDefaultRenderer(ImageIcon.class, new ImageRenderer());
        jTable.setRowHeight(50);

        TableColumn tc = jTable.getColumnModel().getColumn(2);
        JComboBox<Double> jcb = new JComboBox<>(
            new Double[]{2.0, 3.0, 3.5, 4.0, 4.5, 5.0}
        );

        tc.setCellEditor(
            new DefaultCellEditor(jcb)
        );


        this.add(jTable);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
