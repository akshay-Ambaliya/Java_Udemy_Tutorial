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
class MyListFrame extends Frame{
    List list;
    Choice choice;
    TextArea t1;
    
    public MyListFrame(String str){
        super(str);
        
        t1 = new TextArea(20,30);
        
        list = new List(4,true);
        list.add("Akshay");
        list.add("Khushi");
        list.add("Hitesh");
        list.add("Aryan");
        list.add("Manoj");
        
        
        choice = new Choice();
        choice.add("Ambaliya");
        choice.add("Raval");
        choice.add("Borse");
        choice.add("Pandav");
        choice.add("Ghoghari");
        
        
        setLayout(new FlowLayout());
        
        list.addActionListener(event1);
        choice.addItemListener(event2);
        
        add(list);
        add(choice);
        add(t1);
        
    }
    
    ActionListener event1 = (e)->{
        
        String[] str;
        str = list.getSelectedItems();
        String msg="";
        
        for(String ele:str){
            msg+=(ele+"\n");
        }
        
        t1.setText(msg);
    };
    
    ItemListener event2 = (e)->{
        t1.setText(choice.getSelectedItem());
    };
}
public class DemoList {
    
    public static void main(String[] args) {
        MyFrame frame= new MyFrame("My TextBox");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

}
