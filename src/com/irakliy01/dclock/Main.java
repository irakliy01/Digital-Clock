package com.irakliy01.dclock;

import javafx.application.Application;
import javafx.css.Size;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private final double SIZE = 20;

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.BLACK);
        
        root.getChildren().add(new ClockNumber(SIZE, scene.getWidth() * 0.2, scene.getHeight() / 2).getNumber());
        root.getChildren().add(new ClockNumber(SIZE, scene.getWidth() * 0.4, scene.getHeight() / 2).getNumber());
        root.getChildren().add(new ClockNumber(SIZE, scene.getWidth() * 0.6, scene.getHeight() / 2).getNumber());
        root.getChildren().add(new ClockNumber(SIZE, scene.getWidth() * 0.8, scene.getHeight() / 2).getNumber());

        primaryStage.setTitle("Digital Clock");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
