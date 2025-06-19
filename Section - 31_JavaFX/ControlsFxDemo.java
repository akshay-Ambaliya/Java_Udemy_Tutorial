
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class ControlsFxDemo extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    Text t;
    RadioButton[] r;
    CheckBox[] c;
    ChoiceBox<Integer> cb;
        
    @Override
    public void start(Stage stage) throws Exception {
        
        t = new Text("Hellow World : ");
        HBox hb = new HBox();
        hb.getChildren().add(t);
        
        r = new RadioButton[]{new RadioButton("Red"),
            new RadioButton("Green"),
            new RadioButton("Blue")};
            
        ToggleGroup tg = new ToggleGroup();
        r[0].setToggleGroup(tg);
        r[1].setToggleGroup(tg);
        r[2].setToggleGroup(tg);
        
        r[0].setOnAction(listener);
        r[1].setOnAction(listener);
        r[2].setOnAction(listener);
        
        HBox hb1 =new HBox();
        hb1.getChildren().addAll(r);
        
        c = new CheckBox[]{new CheckBox("Normal"),
            new CheckBox("Bold"),
            new CheckBox("Italic")};
        c[0].setOnAction(listener);
        c[1].setOnAction(listener);
        c[2].setOnAction(listener);
        
        
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(c);
        
        cb = new ChoiceBox<>();
        cb.getItems().addAll(10,20,30,40,50,60);
        cb.setOnAction(listener);
        
        VBox vb = new VBox();
        
        vb.getChildren().addAll(hb,hb1,hb2,cb);
        
        hb2.setSpacing(15);
        hb2.setPadding(new Insets(20,20,20,20));
        
        hb1.setSpacing(15);
        hb1.setPadding(new Insets(20,20,20,20));
        
        Scene sc = new Scene(vb,400,400);
        stage.setTitle("Controls ");
        stage.setScene(sc);
        stage.show();
    }
    
    EventHandler<ActionEvent> listener = (ae)->{
        if(r[0].isSelected()) t.setFill(Color.RED);
        if(r[1].isSelected()) t.setFill(Color.GREEN);
        if(r[2].isSelected()) t.setFill(Color.BLUE);
        
        if(c[0].isSelected()) t.setStyle("-fx-font-weight:none");
        if(c[1].isSelected()) t.setStyle("-fx-font-weight:bold");
        if(c[2].isSelected()) t.setStyle("-fx-font-style:italic");
        
        String str = "-fx-font-size:"+cb.getValue();
        t.setStyle(str);
    };
}
