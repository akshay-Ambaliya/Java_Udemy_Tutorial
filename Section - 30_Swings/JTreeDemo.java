/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.io.File;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Dell
 */

class MyJtree extends JFrame{
    JTree tree;
    DefaultMutableTreeNode root;
    
    public MyJtree(){
        super(" Jtree");
       
        root = new DefaultMutableTreeNode("D:\\java");
        
        File file = new File("D:\\java");
        
        for(File ele:file.listFiles()){
            
            DefaultMutableTreeNode temp = new DefaultMutableTreeNode(ele.getName());
            if(ele.isDirectory()){
                for(File f:ele.listFiles()){
                    temp.add(new DefaultMutableTreeNode(f.getName()));
                }
            }
            root.add(temp);
        }
        tree = new JTree(root);
        add(tree);
    }
}

public class JTreeDemo {
    public static void main(String[] args) {
        MyJtree frame = new MyJtree();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
    }
}
