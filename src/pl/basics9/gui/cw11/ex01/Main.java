package pl.basics9.gui.cw11.ex01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        StackPane sp = new StackPane();

        Label etykieta = new Label();
        etykieta.setText("Hello");

        sp.getChildren().add(etykieta);

        Scene scene = new Scene(sp, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
