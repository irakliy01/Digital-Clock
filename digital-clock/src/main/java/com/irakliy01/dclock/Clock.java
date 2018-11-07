package com.irakliy01.dclock;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.time.LocalDateTime;

class Clock {

    private ClockNumber clock[];
    private boolean work = false;
    private Group dots;

    Clock(double size, double width, double Y) {
        dots = new Group();
        clock = new ClockNumber[]{
                new ClockNumber(size, width * 0.1, Y),
                new ClockNumber(size, width * 0.15 + size * 5.5, Y),
                new ClockNumber(size, width * 0.3 + size * 11, Y),
                new ClockNumber(size, width * 0.35 + size * 16.5, Y)
        };
        Circle circle = new Circle(size);
        circle.setCenterY(Y * 0.8);
        circle.setCenterX(width / 2);
        circle.setFill(Color.RED);
        Circle circle1 = new Circle(size);
        circle1.setCenterY(Y * 1.2);
        circle1.setCenterX(width / 2);
        circle1.setFill(Color.RED);
        dots.getChildren().addAll(circle, circle1);
    }

    Node getClock() {
        Group group = new Group();
        for (ClockNumber clockNumber : clock)
            group.getChildren().add(clockNumber.getNumber());
        group.getChildren().add(dots);
        return group;
    }

    void stop() {
        work = false;
    }

    void work() {
        work = true;
        new Thread(() -> {
            while (work) {
                try {
                    LocalDateTime now = LocalDateTime.now();

                    clock[0].update(now.getHour() / 10);
                    clock[1].update(now.getHour() % 10);
                    clock[2].update(now.getMinute() / 10);
                    clock[3].update(now.getMinute() % 10);

                    for (Node circle : dots.getChildren()) {
                        circle.setVisible(!circle.isVisible());
                    }
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
