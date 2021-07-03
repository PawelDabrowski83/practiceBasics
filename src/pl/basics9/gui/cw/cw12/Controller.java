package pl.basics9.gui.cw.cw12;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    Button przycisk;

    public void sayHello(){
        System.out.println("Hello");
        try {
            changeScene();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeScene() throws IOException {
        Scene aktualnaScena = przycisk.getScene();
        Stage aktualneOkno = (Stage) aktualnaScena.getWindow();

        Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Scene nowaScena = new Scene(root, 800, 600);
        aktualneOkno.setScene(nowaScena);
    }


}
