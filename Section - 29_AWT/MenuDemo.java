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

class MyMenuFrame extends Frame{
    
    MenuBar mb;
    MenuItem open,close,save;
    CheckboxMenuItem auto;
    Menu file,edit;
    TextField tf ;
    
    
    public MyMenuFrame(String str){
        super(str);
        
        open = new MenuItem("Open");
        close = new MenuItem("Close");
        save = new MenuItem("Save");
        auto = new CheckboxMenuItem("Auto save");
        
        file = new Menu("File");
        edit = new Menu("Edit");
        
        file.add(open);
        file.add(close);
        file.add(save);
        file.add(auto);
        file.add(edit);
        
        edit.add(new MenuItem("Hello"));
        edit.add(new MenuItem("Hii"));
        
        mb=new MenuBar();
        mb.add(file);
        this.setMenuBar(mb);
        
        this.addWindowListener(new MyAdapter());
        
        tf= new TextField(20);
        add(tf);
        file.addActionListener(listener);
        
    }
    
    ActionListener listener = (e)->{
        tf.setText("Selected : ");
    };
    
    class MyAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}

public class MenuDemo {
    public static void main(String[] args) {
        MyMenuFrame frame= new MyMenuFrame("My Adpater");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
