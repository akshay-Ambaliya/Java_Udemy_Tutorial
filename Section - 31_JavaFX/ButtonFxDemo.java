/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class ButtonFxDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b = new Button("_Click");
        //b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true);
        
        Tooltip tp = new Tooltip("Click This Button ");
        b.setTooltip(tp);
        b.setStyle("-fx-background-color:#00ffff");
        b.setOnAction((ae)->{
            Alert a = new Alert(AlertType.INFORMATION,"Button clicked");
            a.show();
        });
        FlowPane f = new FlowPane(b);
        Scene sc = new Scene(f,400,400);
        stage.setScene(sc);
        stage.show();
        
    }
}
