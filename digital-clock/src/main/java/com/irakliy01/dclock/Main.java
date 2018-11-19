package com.irakliy01.dclock;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private Clock clock;

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.BLACK);

        double SIZE = 20;
        clock = new Clock(SIZE, scene.getWidth(), scene.getHeight() / 2);

        root.getChildren().add(clock.getClock());
        clock.work();

        primaryStage.setTitle("Digital Clock");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        clock.stop();
        super.stop();
    }
}
