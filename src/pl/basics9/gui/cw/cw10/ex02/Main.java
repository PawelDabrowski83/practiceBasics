package pl.basics9.gui.cw.cw10.ex02;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_PATHNAME = "files/data/bookList.obj";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
            () -> {
                JFrame jFrame = new JFrame("Books");
                jFrame.setSize(800, 600);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//                MyTableModel myTableModel = new MyTableModel();
                JTable jTable = new JTable();


                jFrame.setVisible(true);
            }
        );
    }

    private static List<Book> prepareBookList() {
        List<Book> bookList = new ArrayList<>();
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(FILE_PATHNAME)
            );
            Object obj = objectInputStream.readObject();
            objectInputStream.close();
            if (obj instanceof List){ // cannot check generic type due erasure
                for (Object o : (List) obj) {
                    if (o instanceof Book) {
                        bookList.add((Book) o);
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return bookList;
    }
}
