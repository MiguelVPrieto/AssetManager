package com.example.assetmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // Load the FXML file for the login view
        FXMLLoader loader = new FXMLLoader(
                Main.class.getResource("views/login.fxml")
        );
        Scene scene = new Scene(loader.load(), 1200, 800);

        // Set the title and scene for the stage
        stage.setTitle("Asset Manager");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
