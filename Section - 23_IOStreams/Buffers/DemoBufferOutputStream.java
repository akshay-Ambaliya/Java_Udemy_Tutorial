/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buffers;

import java.io.*;

/**
 *
 * @author Dell
 */
public class DemoBufferOutputStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("D:\\java\\IOStream\\src\\Buffers\\Test.txt");
        BufferedOutputStream bfout = new BufferedOutputStream(fout);
        
        String str = "Hello ! How are You ??";
        byte[] b = str.getBytes();
        
        for(byte element : b){
            bfout.write((char)element);
        }
        
        bfout.close();
        fout.close();
    }
}
