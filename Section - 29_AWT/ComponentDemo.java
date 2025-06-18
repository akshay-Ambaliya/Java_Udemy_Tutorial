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

class MyComponentFrame extends Frame {
    
    Label label;
    Checkbox check1,check2,check3;
    CheckboxGroup cbg;
    
    public MyComponentFrame(String str){
        super(str);
        setLayout(new FlowLayout());
        
        cbg = new CheckboxGroup();
        label = new Label("Nothing                       ");
        check1 = new Checkbox("Java",false,cbg);
        check2 = new Checkbox("Python",false,cbg);
        check3 = new Checkbox("C++",false,cbg);

        
        add(label);
        add(check1);
        add(check2);
        add(check3);
        
        ItemListener listener= (e)->{
            String message =" ";
            
            if(check1.getState())
                message+=check1.getLabel();
            if(check2.getState())
                message+=check2.getLabel();
            if(check3.getState())
                message+=check3.getLabel();
            
            label.setText(message);
            
        };
        
        check1.addItemListener(listener);
        check2.addItemListener(listener);
        check3.addItemListener(listener);
    }
}

public class ComponentDemo {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame("CheckBox");
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
