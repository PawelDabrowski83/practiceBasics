package pl.basics9.gui.w09.ex04;

import pl.basics9.gui.w09.ex04.struct.Student;

import javax.swing.*;
import java.awt.*;

public class DataInputPanel extends JPanel {

    JLabel lName, lId, lGrade, lGraduate;
    JTextField fName, fId;
    JComboBox<Double> cbGrade;
    JCheckBox cGraduate;

    public DataInputPanel(){
        this.setLayout(
            new GridLayout(4, 2)
        );

        lName = new JLabel("name:");
        lId = new JLabel("id:");
        lGrade = new JLabel("grade:");
        lGraduate = new JLabel("graduate:");

        fName = new JTextField();
        fId = new JTextField();

        cbGrade = new JComboBox<>(
            new Double[]{2.0, 3.0, 3.5, 4.0, 4.5, 5.0}
        );

        cGraduate = new JCheckBox();

        this.add(lName);
        this.add(fName);
        this.add(lId);
        this.add(fId);
        this.add(lGrade);
        this.add(cbGrade);
        this.add(lGraduate);
        this.add(cGraduate);

        /*
        można dodać listener sprawdzający czy focus opuszcza dane pole
        i wtedy dokonać walidacji
         */
    }

    public Student getData() {
        return new Student(
            fName.getText(),
            Integer.parseInt(fId.getText()),
            (Double) cbGrade.getSelectedItem(),
            cGraduate.isSelected()
        );
    }
}
