/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.text.*;

/**
 *
 * @author Dell
 */


class MyJTextFrame extends JFrame{
    
    JTextField tf;
    JFormattedTextField jftf;
    
    public MyJTextFrame(){
        super("Text Demo");
        
        setLayout(new FlowLayout());
        
        tf = new JTextField(20);
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nfr = new NumberFormatter(nf);
        nfr.setAllowsInvalid(false);
        nfr.setMaximum(100000);
       
        
        jftf = new JFormattedTextField(nfr);
        jftf.setColumns(20);
        
        add(tf);
        add(jftf);
    }
}

public class JTextFieldDemo {
    public static void main(String[] args) {
        MyJTextFrame frame = new MyJTextFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
    }
}
