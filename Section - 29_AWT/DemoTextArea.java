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

class MyTextAreaFrame extends Frame{
    
    TextArea ta;
    Button b;
    Label l;
    TextField tf;
    
    public MyTextAreaFrame(String str){
        super(str);
        
        ta=new TextArea(20,30);
        b = new Button("Click");
        b.addActionListener(listener);
        l = new Label("         ");
        tf = new TextField(30);
        
        setLayout(new FlowLayout());
        
        add(tf);
        add(b);
        add(l);
        add(ta);
    }
    
    ActionListener listener = (e)->{
        ta.insert(tf.getText(), ta.getCaretPosition());
    };
    
}

public class DemoTextArea {
    
    public static void main(String[] args) {
        MyFrame frame= new MyFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
