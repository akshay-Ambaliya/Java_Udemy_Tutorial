/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Dell
 */

class InternalFrame extends JInternalFrame{
    public InternalFrame(String str){
        super(str);
        setSize(500,500);
        setVisible(true);
    }
}


class MyInternalFrame extends JFrame{
    int counter = 0;
    JMenu menu;
    JMenuItem mt;
    JMenuBar mb;
    
    JDesktopPane dp;
    
    public MyInternalFrame(){
        super("Inter Frame");

        menu = new JMenu("File");
        mt = new JMenuItem("New");
        mb = new JMenuBar();
        dp=new JDesktopPane();
        menu.add(mt);
        mb.add(menu);
        
        mt.addActionListener(listener);
        
        add(dp,BorderLayout.CENTER);
        add(mb,BorderLayout.NORTH);
    }
    
    ActionListener listener = (r)->{
      dp.add(new InternalFrame(++counter + " Frame")); 
    };
}

public class JInternalFrameDemo {
    public static void main(String[] args) {
        MyInternalFrame frame = new MyInternalFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
    }
}
