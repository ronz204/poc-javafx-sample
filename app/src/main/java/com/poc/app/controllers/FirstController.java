package com.poc.app.controllers;

import com.poc.app.models.First;
import com.poc.app.utils.ViewLoader;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class FirstController {
    
    private static final String VIEW_PATH = "/views/FirstView.fxml";
    
    @FXML
    private Label messageLabel;
    
    @FXML
    private Button actionButton;
    
    @FXML
    private Button resetButton;
    
    private First model;
    
    /**
     * Loads the view associated with this controller.
     * 
     * @return FXMLLoader with the loaded view and initialized controller
     * @throws IOException if the FXML file cannot be loaded
     */
    public static FXMLLoader loadView() throws IOException {
        return ViewLoader.load(VIEW_PATH);
    }
    
    /**
     * Called automatically after FXML is loaded.
     * Initializes the model and binds properties.
     */
    @FXML
    public void initialize() {
        model = new First();
        
        // Bind model property to view label
        // When model changes, view updates automatically
        messageLabel.textProperty().bind(model.messageProperty());
    }
    
    /**
     * Handles action button event.
     * Delegates logic to the model.
     */
    @FXML
    private void handleActionButton() {
        model.incrementCounter();
    }
    
    /**
     * Handles reset button event.
     * Delegates logic to the model.
     */
    @FXML
    private void handleResetButton() {
        model.reset();
    }
    
    /**
     * Getter for the model (useful for testing)
     */
    public First getModel() {
        return model;
    }
}
