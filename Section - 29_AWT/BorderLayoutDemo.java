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

class MyFrame extends Frame{
    Button one,two,three,four,five;
    
    public MyFrame(String str){
        
        super(str);
        setLayout(new BorderLayout(10,10));
        
        
        one = new Button("One");
        two = new Button("Two");
        three = new Button("Three");
        four = new Button("Four");
        five = new Button("Five");
      
        
        add(one,BorderLayout.NORTH);
        add(two,BorderLayout.EAST);
        add(three,BorderLayout.SOUTH);
        add(four,BorderLayout.WEST);
        add(five,BorderLayout.CENTER);
    }
}


public class BorderLayoutDemo {
    public static void main(String[] args) {
        MyFrame frame= new MyFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    } 
}
