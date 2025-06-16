/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filestream;

import java.io.FileInputStream;
import java.io.*;

/**
 *
 * @author Dell
 */
public class CopyToThirdFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fin1 = new FileInputStream("D:\\java\\IOStream\\src\\Filestream\\Test.txt");
        FileInputStream fin2 = new FileInputStream("D:\\java\\IOStream\\src\\Filestream\\Test2.txt");
        FileOutputStream fout = new FileOutputStream("D:\\java\\IOStream\\src\\Filestream\\Test3.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
        
        int b;
        
        while((b=sis.read())!=-1){
            fout.write(b);
        }

    }
}
