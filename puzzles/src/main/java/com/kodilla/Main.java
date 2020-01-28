package com.kodilla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GridPane Experiment");

        GridPane gridPane = new GridPane();

        int counter = 0;
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                MyRetangle rectangle = new MyRetangle( 200, 200, x, y);
                if (counter % 2 == 0) {
                    rectangle.setFill(Color.BLACK);
                } else {
                    rectangle.setFill(Color.GREEN);
                }
                counter++;
                gridPane.add(rectangle, x, y);
            }
        }

        Scene scene = new Scene(gridPane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
