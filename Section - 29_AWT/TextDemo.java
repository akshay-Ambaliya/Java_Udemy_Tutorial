/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;

import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Dell
 */

class MyTextFrame extends Frame{
    Label l1,l2;
    TextField t1;
    
    public MyTextFrame(String str){
        super(str);
        
        l1 = new Label("                    ");
        l2 = new Label("        Hello            ");
        t1 = new TextField(20);
        
        setLayout(new FlowLayout());
        
        ActionListener event = (e)->{
            l1.setText(t1.getText());
        };
        
        TextListener listener = (e)->{
            l2.setText(t1.getText());
        };
        
        t1.addActionListener(event);
        t1.addTextListener(listener);
        
        add(l1);
        add(l2);
        add(t1);
    }
}

public class TextDemo {
    public static void main(String[] args) {
        MyFrame frame= new MyFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
