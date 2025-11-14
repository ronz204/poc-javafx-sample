package com.poc.app.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Utility class to load FXML views.
 * Provides a clean abstraction for loading views with their controllers.
 */
public class ViewLoader {

    /**
     * Loads an FXML view and returns the root node with its controller initialized.
     * 
     * @param fxmlPath The path to the FXML file (e.g., "/views/MainView.fxml")
     * @return FXMLLoader instance with the loaded view
     * @throws IOException if the FXML file cannot be loaded
     */
    public static FXMLLoader load(String fxmlPath) throws IOException {
        FXMLLoader loader = new FXMLLoader(ViewLoader.class.getResource(fxmlPath));
        loader.load(); // This initializes the controller
        return loader;
    }

    /**
     * Loads an FXML view and returns only the root node.
     * 
     * @param fxmlPath The path to the FXML file
     * @return The root Parent node
     * @throws IOException if the FXML file cannot be loaded
     */
    public static Parent loadView(String fxmlPath) throws IOException {
        return load(fxmlPath).getRoot();
    }

    /**
     * Loads an FXML view and returns the controller.
     * 
     * @param fxmlPath The path to the FXML file
     * @param <T> The controller type
     * @return The controller instance
     * @throws IOException if the FXML file cannot be loaded
     */
    public static <T> T loadController(String fxmlPath) throws IOException {
        return load(fxmlPath).getController();
    }
}
