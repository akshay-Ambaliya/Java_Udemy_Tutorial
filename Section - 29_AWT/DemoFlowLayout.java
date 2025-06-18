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

class MyFlowFrame extends Frame{
    Button one,two,three,four,five;
    
    public MyFlowFrame(String str){
        
        super(str);
        FlowLayout fl = new FlowLayout();
        fl.setHgap(20);
        fl.setVgap(20);
        setLayout(fl);
        
        
        one = new Button("One");
        two = new Button("Two");
        three = new Button("Three");
        four = new Button("Four");
        five = new Button("Five");
      
        
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
    }
}


public class DemoFlowLayout {
    public static void main(String[] args) {
        MyFlowFrame frame= new MyFlowFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    } 
}
