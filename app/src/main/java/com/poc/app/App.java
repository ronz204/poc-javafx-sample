package com.poc.app;

import com.poc.app.controllers.FirstController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main entry point for the JavaFX application.
 * Delegates view loading to the controller.
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load view from controller (controller knows its own view)
            FXMLLoader loader = FirstController.loadView();
            Parent root = loader.getRoot();

            // Create scene
            Scene scene = new Scene(root, 400, 300);

            // Configure stage
            primaryStage.setTitle("JavaFX MVC - Clean Architecture");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error loading application: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
