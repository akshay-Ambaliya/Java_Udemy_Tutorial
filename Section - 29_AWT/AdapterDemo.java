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

class MyAdapterFrame extends Frame{
    
    public MyAdapterFrame(String str){
        Label l = new Label("Hello");
        
        setLayout(new FlowLayout());
        add(l);
        this.addWindowListener(new MyAdapter());
    }
    
    
    class MyAdapter extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        MyAdapterFrame frame= new MyAdapterFrame("My Adpater");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }    
}
