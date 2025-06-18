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

class MyGridBagFrame extends Frame{
    Button one,two,three,four,five;
    
    public MyGridBagFrame(String str){
        
        super(str);
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        one = new Button("One");
        two = new Button("Two");
        three = new Button("Three");        
        four = new Button("Four");
        five = new Button("Five");
      
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(one,gbc);
                        
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(two,gbc);
        
                        
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(three,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(four,gbc);
        
                        
        gbc.gridx = 4;
        gbc.gridy = 4;
        add(five,gbc);
        
    }
    
}

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        MyFrame frame= new MyFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
