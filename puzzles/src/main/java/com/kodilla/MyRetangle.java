package com.kodilla;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyRetangle extends Rectangle {

    int x, y;

    public MyRetangle(double width, double height, int x, int y) {
        super(width, height);

        this.setOnMouseClicked(event -> {
            System.out.println("Clicked " + x + " " + y);

            setFill(Color.RED);

        });


    }

}
