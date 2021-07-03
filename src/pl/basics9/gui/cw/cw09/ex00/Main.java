package pl.basics9.gui.cw.cw09.ex00;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                () -> {

                    JFrame okno = new JFrame();
                    okno.setSize(800, 600);
                    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;

                    JList lista = new JList();

                    DefaultListModel<String> dlm = new DefaultListModel<>();

                    dlm.addElement("Ala");
                    dlm.addElement("ma");
                    dlm.addElement("Kota");

                    lista.setModel(dlm);

                    JScrollPane jsp = new JScrollPane(lista);


                    okno.add(jsp);
                    okno.setVisible(true);



                }
        );
    }


}
