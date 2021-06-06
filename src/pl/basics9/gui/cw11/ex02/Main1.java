package pl.basics9.gui.cw11.ex02;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main1 extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();

        Button button = new Button();
        button.setText("Hello world!");
        button.setPrefSize(200, 100);
        button.setAlignment(Pos.CENTER);

        button.setOnAction(
            e -> button.setText("Hi!")
        );

        root.getChildren().add(button);
        Scene scene = new Scene(root, 800, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
