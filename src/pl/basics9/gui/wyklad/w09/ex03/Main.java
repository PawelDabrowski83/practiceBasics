package pl.basics9.gui.wyklad.w09.ex03;

import javax.swing.*;
import java.awt.event.ItemEvent;

public class Main extends JFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new Main()
        );
    }

    public Main() {

        String[] tab = {"2", "3", "3.5", "4", "5"};

        JComboBox<String> jcb = new JComboBox<>(tab);

        /*
        jcb.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if(e.getStateChange() == ItemEvent.SELECTED){
                            System.out.println(e);
                        }
                    }
                }
        );
*/

        jcb.addItemListener(
                (e) -> {
                    if (e.getStateChange() == ItemEvent.SELECTED){
                        System.out.println(e);
                    }
                }
        );
        this.add (jcb);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
