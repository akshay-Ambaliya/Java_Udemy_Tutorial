/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author Dell
 */

class MyTabbedPaneDemo extends JFrame{
    JTabbedPane jtp;
    JPanel p1;
    JPanel p2;
    JList l;
    JScrollPane jp;
            
    public MyTabbedPaneDemo(){
        super("My splite Pane");
        
        String [] colors = {"Red","Blue","Green","Black"};
        
        p1 = new JPanel();
        p2 = new JPanel();
        l = new JList(colors);
        jp = new JScrollPane(p1);
        jtp = new JTabbedPane();
        
        p2.setBackground(Color.red);
        
        jtp.addTab("Color",jp);
        jtp.add("Panel",p2);
        

        
        add(jtp);
        p1.add(l);
        
        l.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e) {
                switch((String)l.getSelectedValue()){
                    case "Red":
                        p2.setBackground(Color.red);
                    break;
                    case "Blue":
                        p2.setBackground(Color.BLUE);
                    break; 
                    case "Green":
                        p2.setBackground(Color.GREEN);
                    break;
                    case "Black": 
                        p2.setBackground(Color.black);
                    break;
                }
            }
        });
    }
}



class MySplitePaneFrame extends JFrame{
    
    JSplitPane jsp;
    JPanel p1;
    JPanel p2;
    JList l;
    JScrollPane jp;
            
    public MySplitePaneFrame(){
        super("My splite Pane");
        
        String [] colors = {"Red","Blue","Green","Black"};
        
        p1 = new JPanel();
        p2 = new JPanel();
        l = new JList(colors);
        jp = new JScrollPane(p1);
        jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jp,p2);
        jsp.setDividerLocation(250);
        p2.setBackground(Color.red);
        add(jsp);
        p1.add(l);
        
        l.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e) {
                switch((String)l.getSelectedValue()){
                    case "Red":
                        p2.setBackground(Color.red);
                    break;
                    case "Blue":
                        p2.setBackground(Color.BLUE);
                    break; 
                    case "Green":
                        p2.setBackground(Color.GREEN);
                    break;
                    case "Black": 
                        p2.setBackground(Color.black);
                    break;
                }
            }
        });
    }
}

public class JSplitePaneDemo {
    public static void main(String[] args) {
//        MySplitePaneFrame frame = new MySplitePaneFrame();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,700);
        
        MyTabbedPaneDemo frame = new MyTabbedPaneDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
    }
}
