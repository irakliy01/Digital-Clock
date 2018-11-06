package com.irakliy01.dclock;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;

public class ClockNumber {

    private int numbers[] = new int[] {0x7E, 0x30, 0x6D, 0x79, 0x33, 0x5B, 0x5F, 0x70, 0x7F, 0x7B};
    private Group number;

    /*
    root.getChildren().add(new Segment(SIZE, Color.RED, scene.getWidth() * 0.2 - SIZE * 2, scene.getHeight() / 2 - SIZE * 5.5).getSegment());
        root.getChildren().add(new Segment(SIZE, Color.BLANCHEDALMOND, scene.getWidth() * 0.2, scene.getHeight() / 2 - SIZE * 3).rotate(90).getSegment());
        root.getChildren().add(new Segment(SIZE, Color.BLUE, scene.getWidth() * 0.2, scene.getHeight() / 2 + SIZE * 2).rotate(90).getSegment());
        root.getChildren().add(new Segment(SIZE, Color.PURPLE, scene.getWidth() * 0.2 - SIZE * 2, scene.getHeight() / 2 + SIZE * 4.5).getSegment());
        root.getChildren().add(new Segment(SIZE, Color.INDIANRED, scene.getWidth() * 0.2 - SIZE * 4, scene.getHeight() / 2 + SIZE * 2).rotate(90).getSegment());
        root.getChildren().add(new Segment(SIZE, Color.GREEN, scene.getWidth() * 0.2 - SIZE * 4, scene.getHeight() / 2 - SIZE * 3).rotate(90).getSegment());
        root.getChildren().add(new Segment(SIZE, Color.YELLOW, scene.getWidth() * 0.2 - SIZE * 2, scene.getHeight() / 2 - SIZE / 2).getSegment());
     */

    ClockNumber(double size, double X, double Y) {
        number = new Group();
        number.getChildren().add(new Segment(size, Color.RED, X - size * 2, Y - size * 5.5).getSegment());
        number.getChildren().add(new Segment(size, Color.BLANCHEDALMOND, X, Y - size * 3).rotate(90).getSegment());
        number.getChildren().add(new Segment(size, Color.BLUE, X, Y + size * 2).rotate(90).getSegment());
        number.getChildren().add(new Segment(size, Color.PURPLE, X - size * 2, Y + size * 4.5).getSegment());
        number.getChildren().add(new Segment(size, Color.INDIANRED, X - size * 4, Y + size * 2).rotate(90).getSegment());
        number.getChildren().add(new Segment(size, Color.GREEN, X - size * 4, Y - size * 3).rotate(90).getSegment());
        number.getChildren().add(new Segment(size, Color.YELLOW, X - size * 2, Y - size / 2).getSegment());
    }

    Node getNumber() {
        return number;
    }

}
