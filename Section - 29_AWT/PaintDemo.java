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

class MyPaintFrame extends Frame {
    
    int x=0,y=0;
    
    public MyPaintFrame(){
        super("Painting");
        this.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
    }
    
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50);
    }
}


public class PaintDemo {
    public static void main(String[] args) {
        MyPaintFrame mpf = new MyPaintFrame();
        mpf.setSize(400,400);
        mpf.setVisible(true);
    }
}
