/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfx;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class EventFxDemo extends Application{

    int count=0;
    Button b;
    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setTitle("Event Handeling Demo");
 
        b = new Button("Click");
        b.setPrefSize(100, 40);
        b.setOnAction(listener);
        
        
        FlowPane fp = new FlowPane(b);       
        Scene sc = new Scene(fp,400,400);
        
        stage.setScene(sc);
        stage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

    EventHandler<ActionEvent> listener = (e)->{
        count++;
        b.setText(((Integer)count).toString());
    };
    
}
