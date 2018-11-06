package com.irakliy01.dclock;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.BLACK);

        root.getChildren().add(new Segment(15, Color.RED, 100, 100).getSegment());

        primaryStage.setTitle("Digital Clock");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
