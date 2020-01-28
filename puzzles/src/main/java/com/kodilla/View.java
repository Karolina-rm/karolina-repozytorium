package com.kodilla;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class View {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private AnchorPane pane;
    private Scene scene;
    private Stage stage;


    public View() {
        pane = new AnchorPane();
        scene  = new Scene(pane, WIDTH, HEIGHT);
        stage = new Stage();
        stage.setScene(scene);
        createButtons();
    }

    public Stage getStage() {
        return stage;
    }

    private void createButtons() {

        Button button = new Button("Click!");
        pane.getChildren().add(button);
    }






}
