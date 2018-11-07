package com.irakliy01.dclock;

import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

class Segment {

    private Polygon segment;

    Segment(double size, Paint color, double X, double Y) {
        if (size <= 0)
            throw new IllegalArgumentException("Size should be higher than 0");
        segment = new Polygon(0, size / 2, size * 0.6, 0, size * 3.4, 0, size * 4, size / 2, size * 3.4, size, size * 0.6, size);
        segment.setFill(color);
        segment.setLayoutX(X);
        segment.setLayoutY(Y);
    }

    Segment rotate() {
        segment.setRotate(90);
        return this;
    }

    Node getSegment() {
        return segment;
    }

}
