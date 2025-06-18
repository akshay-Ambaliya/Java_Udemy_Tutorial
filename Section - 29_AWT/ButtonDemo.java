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

class MyButtonFrame extends Frame implements ActionListener{
    
    int count=0;
    Label label;
    Button button ;
    public MyButtonFrame(String str){
        
        super(str);
        label = new Label(count+"");
        button =  new Button("click");
        button.addActionListener(this);
        
        setLayout(new FlowLayout());
        
        add(label);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(++count+"");
    }
}
public class ButtonDemo {
    public static void main(String[] args) {
        
        MyFrame frame = new MyFrame("My Frame");
        frame.setSize(400,400);
        frame.setVisible(true);
    }     
}
