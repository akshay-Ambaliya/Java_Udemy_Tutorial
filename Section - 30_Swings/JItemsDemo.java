/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author Dell
 */

class JItemFrame extends JFrame{
    JRadioButton jb1;
    JRadioButton jb2;
    JCheckBox jc1;
    JCheckBox jc2;
    JPanel p;
    JTextField jtf;
    
    public JItemFrame(){
        super("CheckBox and RadioButton");
        setLayout(new FlowLayout());
        
        jb1 = new JRadioButton("UPPER");
        jb1.setActionCommand("Upper");
        
        jb2 = new JRadioButton("lower");
        jb2.setActionCommand("Lower");
        
        jc1 = new JCheckBox("Bold");
        jc2 = new JCheckBox("Italic");
        jtf = new JTextField(20);
        p=new JPanel();
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jb1);
        bg.add(jb2);
        
        jb1.addActionListener(listener);
        jb2.addActionListener(listener);
        jc1.addActionListener(listener);
        jc2.addActionListener(listener);
        
        p.add(jtf);
        p.add(jb1);
        p.add(jb2);
        
        add(p);
        add(jc1);
        add(jc2);
      
    }
    
    ActionListener listener = (e)->{
        
        int b=0;
        int i=0;
        if(e.getActionCommand().equals("Upper"))
                jtf.setText(jtf.getText().toUpperCase());
            
        if(e.getActionCommand().equals("Lower"))
            jtf.setText(jtf.getText().toLowerCase());
        
        if(jc1.isSelected())b=Font.BOLD;
        if(jc2.isSelected())i=Font.ITALIC;
        
        jtf.setFont(new Font("Times New Roman",b|i,15));
        
    };
}

public class JItemsDemo {
    public static void main(String[] args) {
        JItemFrame frame = new JItemFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        
    }
}
