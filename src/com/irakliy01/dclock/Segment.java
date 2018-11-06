package com.irakliy01.dclock;

import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;

class Segment {

    private Polygon segment;

    Segment(double size) {
        if (size <= 0)
            throw new IllegalArgumentException("Size should be higher than 0");
        segment = new Polygon(1.0 * size, 1.5 * size, 1.5 * size, 1.0 * size, 4.5 * size, 1.0 * size, 5.0 * size, 1.5 * size, 4.5 * size, 2.0 * size, 1.5 * size, 2.0 * size);
    }

    Segment(double size, Paint color) {
        if (size <= 0)
            throw new IllegalArgumentException("Size should be higher than 0");
        segment = new Polygon(1.0 * size, 1.5 * size, 1.5 * size, 1.0 * size, 4.5 * size, 1.0 * size, 5.0 * size, 1.5 * size, 4.5 * size, 2.0 * size, 1.5 * size, 2.0 * size);
        segment.setFill(color);
    }

    Segment(double size, Paint color, double X, double Y) {
        if (size <= 0)
            throw new IllegalArgumentException("Size should be higher than 0");
        segment = new Polygon(1.0 * size, 1.5 * size, 1.5 * size, 1.0 * size, 4.5 * size, 1.0 * size, 5.0 * size, 1.5 * size, 4.5 * size, 2.0 * size, 1.5 * size, 2.0 * size);
        segment.setFill(color);
        segment.setLayoutX(X);
        segment.setLayoutY(Y);
    }

    Segment(double size, double X, double Y) {
        if (size <= 0)
            throw new IllegalArgumentException("Size should be higher than 0");
        segment = new Polygon(1.0 * size, 1.5 * size, 1.5 * size, 1.0 * size, 4.5 * size, 1.0 * size, 5.0 * size, 1.5 * size, 4.5 * size, 2.0 * size, 1.5 * size, 2.0 * size);
        segment.setLayoutX(X);
        segment.setLayoutY(Y);
    }

    public Node getSegment() {
        return segment;
    }

}
