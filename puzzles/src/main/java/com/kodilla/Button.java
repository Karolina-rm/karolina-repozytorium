package com.kodilla;

import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Button extends javafx.scene.control.Button {

    private final String FONT_PATH = "kenvector_future_thin.ttf";
    private final String PRESSED_BUTTON = "-fx-background-color: transparent; -fx-background-image: url('blue_button02.png');";
    private final String UNPRESSED_BUTTON = "-fx-background-color: transparent; -fx-background-image: url('blue_button00.png');";

    public Button(String text) {
        setText(text);
        setFont();
        setPrefWidth(190);
        setPrefHeight(49);
        setStyle(UNPRESSED_BUTTON);
        setButtonOptions();
    }

    private void setFont() {
        try {

            setFont(Font.loadFont(new FileInputStream(FONT_PATH), 20));
        } catch (FileNotFoundException e) {
            setFont(Font.font("Arial", Double.parseDouble("20")));
        }
    }

    private void setUnpressedButtonStyle() {
        setStyle(UNPRESSED_BUTTON);
        setPrefHeight(40);
        setLayoutY(getLayoutY() -4);
    }

    private void setPressedButtonStyle() {
        setStyle(PRESSED_BUTTON);
        setPrefHeight(35);
        setLayoutY(getLayoutY() +4);

    }

    private void setButtonOptions() {

        setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton().equals(MouseButton.PRIMARY)) {
                    setPressedButtonStyle();
                }
            }
        });

        setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton().equals(MouseButton.PRIMARY)) {
                    setUnpressedButtonStyle();
                }
            }
        });

        setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                setEffect(new DropShadow());
                }
        });

        setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                setEffect(null);
            }
        });



    }
}




