/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;
import java.awt.*;
/**
 *
 * @author Dell
 */
public class FirstApplication extends Frame {
    
    public FirstApplication(String str){
        super(str);
        setLayout(new FlowLayout());
        
        
        Label label = new Label("Enter Name : ");
        TextField tf = new TextField(20);
        Button button = new Button("Ok");
        
        add(label);
        add(tf);
        add(button);
        
                

    }
    public static void main(String[] args) {
       FirstApplication first = new FirstApplication("Hello");
       first.setSize(200, 200);
       first.setVisible(true);
    }
}
