/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class FirstFx extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b = new Button("Click");
        FlowPane fp = new FlowPane();
        fp.getChildren().add(b);
        Scene sc = new Scene(fp);
        
        stage.setScene(sc);
        stage.show();
    }
}
