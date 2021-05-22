package pl.basics9.gui.w09.ex04;

import pl.basics9.gui.w09.ex04.struct.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {
    public static final String FILEPATH = "files/studentList.obj";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> {
                    new Main();
                }
        );
    }
    List<Student> studentList = null;

    public Main() {

        this.setLayout(
            new BorderLayout()
        );



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

        DataInputPanel dip = new DataInputPanel();

        DefaultListModel<Student> dlm = new DefaultListModel<>();

        for (Student student : studentList) {
            dlm.add(0, student);
        }

        JList<Student> jList = new JList<>(dlm);
        JButton jButton = new JButton("Add");

        this.add(dip, BorderLayout.LINE_START);
        this.add(jList, BorderLayout.LINE_END);
        this.add(jButton, BorderLayout.PAGE_END);

        jButton.addActionListener(
            (e) -> {
                Student student = dip.getData();
                studentList.add(student);
                System.out.println(student);
                dlm.add(0, student);
            }
        );

        this.addWindowListener(
                new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        super.windowClosing(e);

                        try {
                            ObjectOutputStream ous = new ObjectOutputStream(
                                    new FileOutputStream(FILEPATH)
                            );
                            ous.writeObject(studentList);
                            ous.close();
                        } catch (IOException ie) {
                            ie.printStackTrace();
                        }
                    }
                }
        );

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
