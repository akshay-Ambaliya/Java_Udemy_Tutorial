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

class MyScrollFrame extends Frame{
    TextArea ta ;
    Scrollbar sb1;
    Scrollbar sb2;
    Scrollbar sb3;
    
    public MyScrollFrame(String str){
        
        super(str);
        setLayout(null);
        
        ta = new TextArea();
       
        sb1 = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        sb2 = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        sb3 = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
                
        ta.setBounds(50, 50, 300,70);
        sb1.setBounds(30, 150, 200,30 );
        sb2.setBounds(30, 200, 200, 30);
        sb3.setBounds(30, 250, 200, 30);
        
        add(ta);
        add(sb1);
        add(sb2);
        add(sb3);
        
        sb1.addAdjustmentListener(listener);
        sb2.addAdjustmentListener(listener);
        sb3.addAdjustmentListener(listener);
        
    }

  
    AdjustmentListener listener = (e)->{
        ta.setBackground(new Color(sb1.getValue(),sb2.getValue(),sb3.getValue()));
    };
}



public class DemoScrollbar { 
    public static void main(String[] args) {
        MyFrame frame= new MyFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }        
}
