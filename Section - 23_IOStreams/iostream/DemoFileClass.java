/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iostream;

import java.io.File;

/**
 *
 * @author Dell
 */
public class DemoFileClass {
    public static void main(String[] args) throws Exception {
        File file = new File("D:\\java");
        System.out.println("isDirectory : " + file.isDirectory());
        System.out.println("isFile : " + file.isFile());
        System.out.println("getName : " +file.getName());
        System.out.println("getParent : "+file.getParent());
        System.out.println("getPath : " + file.getPath());
        
        File[] f = file.listFiles();
        
        for(File element : f){
            System.out.println(element.getName());
        }
        
    }
}
