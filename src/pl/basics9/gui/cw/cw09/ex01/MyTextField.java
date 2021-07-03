package pl.basics9.gui.cw.cw09.ex01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MyTextField extends JTextField {

    public MyTextField(){
        this.setPreferredSize(
            new Dimension(100, 15)
        );

        this.addFocusListener(
                new FocusAdapter() {
                    @Override
                    public void focusGained(FocusEvent e) {
                        super.focusGained(e);
                    }

                    @Override
                    public void focusLost(FocusEvent e) {
                        System.out.println("focus lost - add validation here");
                        String value = MyTextField.super.getText();
                        if (NumberValidator.isValidNumber(value)) {
                            super.focusLost(e);
                        } else {
                            System.out.println("Incorrect number: " + value);
                        }

                    }
                }
        );

    }
}
