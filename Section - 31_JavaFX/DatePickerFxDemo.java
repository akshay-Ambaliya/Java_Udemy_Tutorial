/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfx;

import java.io.File;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class DatePickerFxDemo extends Application{

    public static void main(String[] args) {
        launch();
    }
    
   
    TextArea ta;
    Slider sd;
    DatePicker dp;
    ChoiceBox cb;
    FileChooser fc;
    ColorPicker cp;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        dp = new DatePicker();
        dp.setShowWeekNumbers(true);
        
        cp = new ColorPicker();
        
        ta = new TextArea();
        ta.setPrefColumnCount(100);
        ta.setPrefColumnCount(30);
        
        sd = new Slider(10,70,20);
        sd.setMajorTickUnit(1);
        sd.setShowTickMarks(true);
        
        Button b = new Button("Open File");
        
        VBox vb = new VBox();
        vb.getChildren().addAll(ta,sd,dp,cp,b);
        vb.setAlignment(Pos.CENTER);
        sd.valueProperty().addListener(e->ta.setFont(Font.font(sd.getValue())));
        
        
        cp.setOnAction((ae)->{
            
            ta.setStyle("-fx-text-fill:#"+cp.getValue().toString().substring(2,8));
            //ta.setText(cp.getValue().toString().substring(2,8));
            
        });
        
        
        
        dp.setOnAction((e)->{ta.setText("Date : "+dp.getValue() + ta.getText()+"\n");});
        b.setOnAction((e)->{
        
            fc = new FileChooser();
            File file = fc.showOpenDialog(stage);
            
            try{
                FileInputStream fin = new FileInputStream(file);
                byte[] bArray = new byte[fin.available()];
                fin.read(bArray);
                ta.setText(ta.getText()+new String(bArray));
            }catch(Exception ea){
            }            
        });
        
        
        
        
        
        Scene sc = new Scene(vb,500,500);
        stage.setScene(sc);
        stage.setTitle("TextArea and Slider ");
        stage.show();
    }
    
    
    
}
