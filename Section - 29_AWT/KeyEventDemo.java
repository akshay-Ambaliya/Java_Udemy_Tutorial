/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
;

/**
 *
 * @author Dell
 */

class MyKeyFrame extends Frame implements KeyListener{
    Label l1,l2,l3,l4;
    
    public MyKeyFrame(String str){
        super(str);
        setLayout(new GridLayout(4,1));
        
        l1 = new Label("Label 1");
        l2 = new Label("Label 2");
        l3 = new Label("Label 3");
        l4 = new Label("Label 4");
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l1.setText(new Date(e.getWhen())+"");   
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l2.setText("Key Pressed");
        l3.setText("");
        l4.setText(e.getKeyChar()+"");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l3.setText("Key Released");
        l2.setText("");
    }
}

public class KeyEventDemo {
    public static void main(String[] args) {
        MyFlowFrame frame= new MyFlowFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    } 
}
