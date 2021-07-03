package pl.basics9.gui.wyklad.w16;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Point3D;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main0703 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Cylinder cylinder = new Cylinder(40, 120);
        cylinder.setTranslateX(300);
        cylinder.setTranslateY(300);
        cylinder.setTranslateZ(0);

        PhongMaterial mat = new PhongMaterial();
        mat.setDiffuseColor(Color.FORESTGREEN);
        mat.setSpecularColor(Color.LIMEGREEN);
        cylinder.setMaterial(mat);

        Box box = new Box(100, 100, 100);
        box.setTranslateX(100);
        box.setTranslateY(300);
        box.setTranslateZ(0);
        box.setRotate(50);
        box.setRotationAxis(
                new Point3D(100, 100, 0)
        );

        PhongMaterial brick = new PhongMaterial();
        brick.setBumpMap(new Image("https://us.v-cdn.net/5021068/uploads/editor/vm/e1geg74rjj07.jpg"));
        brick.setDiffuseColor(Color.RED);
        brick.setSpecularColor(Color.TOMATO);
        box.setMaterial(brick);

        Sphere sphere = new Sphere(60);
        sphere.setTranslateX(500);
        sphere.setTranslateY(300);
        sphere.setTranslateZ(0);
        sphere.setRotationAxis(
                new Point3D(1, 1, 0)
        );

//        sphere.setDrawMode(DrawMode.LINE);
        PhongMaterial earth = new PhongMaterial();
        earth.setSelfIlluminationMap(
                new Image("https://i0.wp.com/www.genuinecoder.com/wp-content/uploads/2018/10/Earth-illumination-map.jpg")
        );
        sphere.setMaterial(earth);
        RotateTransition rotateTransition = new RotateTransition(
                Duration.seconds(10), sphere
        );
        rotateTransition.setCycleCount(Timeline.INDEFINITE);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setToAngle(360);

        rotateTransition.play();

        AmbientLight ambientLight = new AmbientLight(
                Color.web("0x404040")
        );
        PointLight pointLight = new PointLight(
                Color.web("0xffcc33")
        );
        pointLight.setTranslateX(400);
        pointLight.setTranslateY(300);
        pointLight.setTranslateZ(-500);

        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(0);
        camera.setTranslateY(0);
        camera.setTranslateZ(-200);

        Group root = new Group(
                cylinder, box, sphere,
                ambientLight, pointLight
        );

        Scene scene = new Scene(root, 600, 600);
        scene.setCamera(camera);

        scene.setOnMouseClicked(
                mouseEvent -> {
                    Node picked = mouseEvent.getPickResult().getIntersectedNode();
                    if (picked != null) {
                        double scal = 2;

                        if (picked.getScaleX() > 1) {
                            scal = 1;
                        }
                        picked.setScaleX(scal);
                        picked.setScaleY(scal);
                        picked.setScaleZ(scal);
                    }
                }
        );

        scene.setOnKeyPressed(
                keyEvent -> {
                    switch (keyEvent.getCode()) {
                        case W -> camera.setTranslateZ(camera.getTranslateZ() + 10);
                        case S -> camera.setTranslateZ(camera.getTranslateZ() - 10);
                        case A -> camera.setTranslateX(camera.getTranslateX() + 10);
                        case D -> camera.setTranslateX(camera.getTranslateX() - 10);
                        case Z -> camera.setTranslateY(camera.getTranslateY() + 10);
                        case X -> camera.setTranslateY(camera.getTranslateY() - 10);
                    }
                }
        );

        stage.setScene(scene);
        stage.show();
    }
}
