/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class LayoutsFxDemo extends Application{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Button[] b = new Button[]{
            new Button("one"),
            new Button("two"),
            new Button("three"),
            new Button("four"),
            new Button("five")
        };
        
//        FlowPane fp = new FlowPane();
//        TilePane fp = new TilePane();
//        BorderPane fp = new BorderPane();
        GridPane fp = new GridPane();
        
        fp.add(b[0], 1, 1);
        fp.add(b[1], 0, 0);
        fp.add(b[2], 1, 0);
        fp.add(b[3], 0, 1);
        fp.add(b[4], 0, 2);
        
        
        
        
        Scene sc = new Scene(fp,500,500);
        stage.setScene(sc);
        stage.setTitle("TextArea and Slider ");
        stage.show();
        
        
    }
}
