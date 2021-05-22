package pl.basics9.gui.w10.ex01;

import pl.basics9.gui.w09.ex04.struct.Student;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import static pl.basics9.gui.w09.ex04.Main.FILEPATH;

public class StudentModel implements TableModel {

    List<Student> studentList = null;

    public StudentModel() {
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(FILEPATH)
            );
            studentList = (ArrayList<Student>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
            studentList = new ArrayList<>();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            studentList = new ArrayList<>();
        }
    }

    @Override
    public int getRowCount() {
        return studentList.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch(columnIndex){
            case 2 -> Double.class;
            case 3 -> Boolean.class;
            case 4 -> ImageIcon.class;
            default -> String.class;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return switch(columnIndex){
            case 2 -> true;
            case 3 -> true;
            default -> false;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        return switch (columnIndex){
            case 0 -> studentList.get(rowIndex).getName();
            case 1 -> studentList.get(rowIndex).getId();
            case 2 -> studentList.get(rowIndex).getGrade();
            case 3 -> studentList.get(rowIndex).isGraduate();
            case 4 -> studentList.get(rowIndex).getId();
            default -> "";
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 2 -> studentList.get(rowIndex).setGrade(
                    (Double) aValue
            );
            case 3 -> studentList.get(rowIndex).setGraduate(
                (Boolean) aValue
            );
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
