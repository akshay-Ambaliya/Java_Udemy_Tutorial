/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jfx;


import java.io.*;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */

class Customer implements Serializable
{
    private int custid;
    private String name;
    private String address;
    
    public Customer(int c,String n,String a)
    {
        custid=c;
        name=n;
        address=a;
    }
    
    
    public int getID(){return custid;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public void setAddress(String add){address=add;}
}



public class ComboBoxFxDemo extends Application{
    
    public static void main(String[] args) {
        launch();
    }

    int counter =0;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        
        HashMap <Integer,Customer> customers = new HashMap<>();
        
        Font f = new Font("Verdana",20);
        
        Label l1 = new Label("Customer Id");
        l1.setFont(f);
        
        Label l2 = new Label("Name ");
        l2.setFont(f);
        
        Label l3 = new Label("Address ");
        l3.setFont(f);
        
        ComboBox<Integer> cust = new ComboBox<>();
        
        TextField name = new TextField();
        TextField address = new TextField();
        
        name.setPrefColumnCount(15);
        address.setPrefColumnCount(15);
        
        Button save = new Button("Save");
        Button create = new Button("Create");

        
        create.setOnAction((ae)->{
        
            counter++;
            cust.getItems().add(counter);
            cust.setValue(counter);
            
        });
        
        save.setOnAction((ae)->{
        
            customers.put(counter, new Customer(counter,name.getText(),address.getText()));
            
            
            try(FileOutputStream fout = new FileOutputStream("D:\\java\\JFX\\src\\jfx\\Test.txt")){
                ObjectOutputStream oout = new ObjectOutputStream(fout);
                
                for(Customer c:customers.values()){
                    oout.writeObject(c);
                }
                
            }catch(Exception e){
                
            }
        });
        
        HBox hb = new HBox(save,create);
        HBox hb2 = new HBox(l1,cust);
        HBox hb3 = new HBox(l2,name);
        HBox hb4 = new HBox(l3,address);
        
        
        VBox vb = new VBox(hb,hb2,hb3,hb4);
       
        Scene scene = new Scene(vb,500,500);
        stage.setTitle("ComboBox");
        stage.setScene(scene);
        stage.show();
    }     
}
