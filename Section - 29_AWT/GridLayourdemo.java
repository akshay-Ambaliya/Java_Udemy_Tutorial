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

class MyGridFrame extends Frame{
    Button one,two,three,four,five;
    
    public MyGridFrame(String str){
        
        super(str);
        setLayout(new GridLayout(3,2));
        
        
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

public class GridLayourdemo {
    public static void main(String[] args) {
        MyFrame frame= new MyFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
