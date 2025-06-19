/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfx;

import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class SliderFxDemo extends Application{
    
    public static void main(String[] args) {
        launch();
    }

    TextArea ta;
    Slider sd;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        ta = new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefColumnCount(30);
        
        sd = new Slider(10,70,20);
        sd.setMajorTickUnit(1);
        sd.setShowTickMarks(true);
        
        VBox vb = new VBox();
        vb.getChildren().addAll(ta,sd);
        
        sd.valueProperty().addListener(e->ta.setFont(Font.font(sd.getValue())));
        
        Scene sc = new Scene(vb,500,500);
        
        stage.setScene(sc);
        stage.setTitle("TextArea and Slider ");
        stage.show();
    }
    
   
}
