/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awt;

import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Dell
 */

class MyMouseFrame extends Frame implements MouseListener,MouseMotionListener{
    Label l1,l2,l3,l4;
    Panel p;
    int counter=0;
    
    public MyMouseFrame(String str){
        super(str);
        setLayout(new GridLayout(4,1));
        
        l1 = new Label("Label 1");
        l2 = new Label("Label 2");
        l3 = new Label("Label 3");
        l4 = new Label("Label 4");
        p = new Panel();
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(p);
        
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        counter++;
        l1.setText(counter+"");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l2.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l2.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l3.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l3.setText("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l4.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l4.setText("Mouse Moved");
    }
}


public class MouseEventDemo {
    public static void main(String[] args) {
        MyFlowFrame frame= new MyFlowFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    } 
}
