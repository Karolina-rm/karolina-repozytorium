package com.kodilla;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.text.Font;

public class Button extends javafx.scene.control.Button {

    private final Image imageBeforeClick = new Image(getClass().getResource("/blue_button00.png").toExternalForm());
    private final Image imageAfterClick = new Image(getClass().getResource("/blue_button02.png").toExternalForm());
    private final String FONT_PATH = "kenvector_future_thin.ttf";

    public Button(String text) {

        BackgroundImage backgroundImage = new BackgroundImage(
                imageBeforeClick,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);

        setText(text);
        setFont();
        setPrefWidth(190);
        setPrefHeight(49);
        setBackground(background);
        setButtonOptions();
    }

    private void setFont() {
        try {

            setFont(Font.loadFont(new FileInputStream(FONT_PATH), 20));
        } catch (FileNotFoundException e) {
            setFont(Font.font("Arial", Double.parseDouble("20")));
        }
    }

//    private void setUnpressedButtonStyle() {
//        setStyle(UNPRESSED_BUTTON);
//        setPrefHeight(40);
//        setLayoutY(getLayoutY() - 4);
//    }

    private void setPressedButtonStyle() {

        BackgroundImage backgroundImage = new BackgroundImage(
                imageAfterClick,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        Background background = new Background(backgroundImage);

        setBackground(background);
        setPrefHeight(80);
        setLayoutY(getLayoutY() + 4);

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

//        setOnMouseReleased(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                if (event.getButton().equals(MouseButton.PRIMARY)) {
//                    setUnpressedButtonStyle();
//                }
//            }
//        });

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




