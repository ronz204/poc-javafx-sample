package com.poc.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class App extends Application {
  
  @Override
  public void start(Stage primaryStage) {
    Label label = new Label("¡Hola desde JavaFX!");
    Button button = new Button("Haz clic aquí");
    
    button.setOnAction(e -> label.setText("¡Botón presionado!"));
    
    VBox root = new VBox(20); // 20px de espaciado
    root.setAlignment(Pos.CENTER);
    root.getChildren().addAll(label, button);
    
    Scene scene = new Scene(root, 400, 300);
    
    primaryStage.setTitle("Mi Primera App JavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
