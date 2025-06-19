/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Dell
 */

class MyJButtonFrame extends JFrame{
    
    int counter=0;
    JLabel l;
    JButton b;
    public MyJButtonFrame(){
        super("Button Demo: ");
        
        setLayout(new FlowLayout());
        l = new JLabel("0");
        b= new JButton("Click");
        
        b.addActionListener((e)->{l.setText(++counter + "");});
        
        add(l);
        add(b);
    }
}

public class JButtonDemo {
    public static void main(String[] args) {
        
        MyJButtonFrame frame = new MyJButtonFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
    }
}
