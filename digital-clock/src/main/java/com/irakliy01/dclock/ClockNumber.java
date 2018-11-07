package com.irakliy01.dclock;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;

class ClockNumber {

    private int numbers[] = new int[]{0x7E, 0x30, 0x6D, 0x79, 0x33, 0x5B, 0x5F, 0x70, 0x7F, 0x7B};
    private Group number;

    ClockNumber(double size, double X, double Y) {
        number = new Group();
        number.getChildren().add(new Segment(size, Color.RED, X - size * 2, Y - size * 5.5).getSegment());
        number.getChildren().add(new Segment(size, Color.RED, X, Y - size * 3).rotate().getSegment());
        number.getChildren().add(new Segment(size, Color.RED, X, Y + size * 2).rotate().getSegment());
        number.getChildren().add(new Segment(size, Color.RED, X - size * 2, Y + size * 4.5).getSegment());
        number.getChildren().add(new Segment(size, Color.RED, X - size * 4, Y + size * 2).rotate().getSegment());
        number.getChildren().add(new Segment(size, Color.RED, X - size * 4, Y - size * 3).rotate().getSegment());
        number.getChildren().add(new Segment(size, Color.RED, X - size * 2, Y - size / 2).getSegment());
    }

    Node getNumber() {
        return number;
    }

    void update(int time) {
        int i = 6;
        for (Node node : number.getChildren()) {
            node.setVisible(((numbers[time] >> i--) & 1) == 1);
        }
    }
}
