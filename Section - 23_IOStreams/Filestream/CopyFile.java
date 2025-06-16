/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filestream;

import java.io.*;

/**
 *
 * @author Dell
 */
public class CopyFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("D:\\java\\IOStream\\src\\Filestream\\Test.txt");
        FileOutputStream fout = new FileOutputStream("D:\\java\\IOStream\\src\\Filestream\\Test2.txt");
        
        int b;
        while((b=fin.read())!=-1)
            fout.write(b);
        
        System.out.println("written");
        fin.close();
        fout.close();
    }
}
