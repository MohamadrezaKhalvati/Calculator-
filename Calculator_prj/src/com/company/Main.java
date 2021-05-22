package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.*;

public class Main  extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception {

            Stage stage = new Stage() ;
            Parent parent = FXMLLoader.load(getClass().getResource("light.fxml"));
            Scene scene = new Scene(parent) ;
            stage.setScene(scene);
            stage.setTitle("Calculator");
            Image image = new Image("/com/company/pic/icons8-calculator-48.png");
            stage.getIcons().add(image);
            stage.show();
    }
}
