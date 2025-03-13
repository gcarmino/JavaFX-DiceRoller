package org.example.diceroller;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class DiceRollerApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label diceLabel = new Label("Click to roll the dice 🎲");
        Button rollButton = new Button("Roll Dice");

        rollButton.setOnAction(e -> {
            Random random = new Random();
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int total = die1 + die2;
            diceLabel.setText("🎲 Die 1: " + die1 + " | Die 2: " + die2 + " | Total: " + total);
        });

        VBox layout = new VBox(10, diceLabel, rollButton);
        layout.setStyle(
                "-fx-font-size: 18px; " +
                        "-fx-background-color: lightblue; " +
                        "-fx-padding: 20px; " +
                        "-fx-alignment: center;"
        );

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Dice Roller");
        primaryStage.show();
    }
}
