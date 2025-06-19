/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Dell
 */

class MyBorderFrame extends JFrame{
    
    JPanel p;
    JTextField tf;
    JLabel l;
    public MyBorderFrame(){
        super("Border");
        setLayout(new FlowLayout());
        p=new JPanel();
        tf = new JTextField(20);
        l = new JLabel("Label");
        
        Border b = BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Login");
        p.add(tf);
        p.setBorder(b);
        
        
        add(l);
        add(p);
    }
    
}
public class JBorderDemo {

    public static void main(String[] args) {
        MyBorderFrame frame = new MyBorderFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
    }        

}
