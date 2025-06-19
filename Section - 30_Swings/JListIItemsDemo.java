/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Dell
 */

class JListFrame extends JFrame{
    JComboBox jcb;
    JList jl;
    JSpinner js;
    JTextField jtf;
    
    public JListFrame(){
        super("List Items : ");
        
        String[] cList = {"Jan","Feb","Mar","Apr","May","Jun","Jul"};
        String[] lList = {"Sunday","Monday","Tuesday","WednesDay","Thursday","Friday","Saturday"};
       
        setLayout(new FlowLayout());
        
        jcb = new JComboBox(cList);
        jl = new JList(lList);
        js = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        jtf = new JTextField(20);
        
        jl.setVisibleRowCount(5);
        jl.addListSelectionListener(listener);
        
        add(jcb);
        add(new JScrollPane(jl));
        add(js);
        add(jtf);  
    }

    ListSelectionListener listener = (e)->{
        jtf.setText((String)jl.getSelectedValue());
    };
}

public class JListIItemsDemo {
    public static void main(String[] args) {
        JListFrame frame = new JListFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
    }
}
