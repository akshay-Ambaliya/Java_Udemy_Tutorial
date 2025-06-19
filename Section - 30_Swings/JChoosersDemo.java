/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Dell
 */


class MyChooserFrame extends JFrame{
    
    JButton[] b;
    JToolBar tb;
    JTextArea ta;
    
    public MyChooserFrame(){
        super("My Chooser ");  
        
        b = new JButton[]{
                new JButton("Open"),
                new JButton("Save"),
                new JButton("File"),
                new JButton("Edit"),
            };
        
        b[0].addActionListener(listener);
        tb = new JToolBar();
        ta = new JTextArea("Akshay");
        
        for(JButton ele:b){
            tb.add(ele);
        }
        
        add(tb,BorderLayout.NORTH);
        add(new JScrollPane(ta),BorderLayout.CENTER);
        
    }
    
    ActionListener listener = (e)->{
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        File file = fc.getSelectedFile();
        byte[] bArray = {};
        
        try(FileInputStream fin = new FileInputStream(file)){
            
            bArray = new byte[fin.available()];
            fin.read(bArray);
            
        }catch(Exception ae){}
        
        ta.setText(new String(bArray));
        
    };
}

public class JChoosersDemo {
    public static void main(String[] args) {
        MyChooserFrame frame = new MyChooserFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
    }
}
