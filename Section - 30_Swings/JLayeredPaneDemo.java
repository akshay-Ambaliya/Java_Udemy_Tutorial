/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;

/**
 *
 * @author Dell
 */

class MyLayeredPaneFrame extends JFrame {
    
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    
    JLayeredPane jlp;
    
    JRadioButton jb1;
    JRadioButton jb2;
    JRadioButton jb3;
    ButtonGroup bg;
    
    public MyLayeredPaneFrame(){
        super("Layered Pane : ");
        
        setLayout(null);
        

        
        l1 = new JLabel("Red");
        l2 = new JLabel("Blue");
        l3 = new JLabel("Green");
        l4 = new JLabel("Black");
        
        jb1 = new JRadioButton("Red");
        jb2 = new JRadioButton("Blue");
        jb3 = new JRadioButton("Green");
        bg =new ButtonGroup();
        
        bg.add(jb1);
        bg.add(jb2);
        bg.add(jb3);
        
        jb1.setBounds(100, 20, 70, 30);
        jb2.setBounds(150, 20, 70, 30);
        jb3.setBounds(200, 20, 70, 30);
        
        l1.setBounds(50, 50, 300, 300);
        l1.setBackground(Color.RED);
        l1.setOpaque(true);
        
        l2.setBounds(80, 80, 300, 300);
        l2.setBackground(Color.BLUE);
        l2.setOpaque(true);
        
        l3.setBounds(110, 110, 300, 300);
        l3.setBackground(Color.GREEN);
        l3.setOpaque(true);
        
        l4.setBounds(20, 20, 50, 50);
        l4.setBackground(Color.black);
        l4.setOpaque(true);
        
        jlp = new JLayeredPane();
        jlp.setBounds(0, 0, 700, 700);
        jlp.add(l1, Integer.valueOf(0));
        jlp.add(l2, Integer.valueOf(1));
        jlp.add(l3, Integer.valueOf(2));
        jlp.add(l4, Integer.valueOf(3));
       
        jb1.addActionListener(listener);
        jb2.addActionListener(listener);
        jb3.addActionListener(listener);
        
        add(jb1);
        add(jb2);
        add(jb3);
        
        add(jlp);
        
        addMouseMotionListener(new MouseMotionAdapter(){
            @Override
            public void mouseMoved(MouseEvent e) {
                l4.setLocation(e.getX(),e.getY());
            }
        });
    }
    
    ActionListener listener = (e)->
    {
        if(jb1.isSelected())
            jlp.setLayer(l4, 1);
        if(jb2.isSelected())
            jlp.setLayer(l4, 2);
        if(jb3.isSelected())
            jlp.setLayer(l4, 3);
    };
}



public class JLayeredPaneDemo {
    public static void main(String[] args) {
        MyLayeredPaneFrame frame = new MyLayeredPaneFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
    }
}
