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



class MyWindowFrame extends Frame{
    
    Label l1;
    
    public MyWindowFrame(String str){
        super(str);
        setLayout(new GridLayout(4,1));
        
        l1 = new Label("Label 1");
        this.addWindowListener(new MyWindow());
        add(l1);
    }
    
    class MyWindow implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            l1.setText("Window Opened : ");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            l1.setText("Window Closing : ");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            l1.setText("Window Closed : ");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            l1.setText("Window Iconified : ");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            l1.setText("Window Deiconified : ");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            l1.setText("Window Activated : ");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            l1.setText("Window DeActivated : ");
        }  
    
    }
}

public class WindowEventDemo  {
    public static void main(String[] args) {
        MyWindowFrame frame= new MyWindowFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
            
}
