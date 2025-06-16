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
public class DemoBufferInputStream {
    public static void main(String[] args) throws Exception{
        FileInputStream fin= new FileInputStream("D:\\java\\IOStream\\src\\Buffers\\Test.txt");
        BufferedInputStream bfin = new BufferedInputStream(fin);
        
        int i;
        while((i = bfin.read())!=-1){
            System.out.print((char)i);
        }
        System.out.println("\n");
        
        bfin.close();
        fin.close();
    }
}
