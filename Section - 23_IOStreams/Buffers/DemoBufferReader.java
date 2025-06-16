package Buffers;

import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class DemoBufferReader {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("D:\\java\\IOStream\\src\\Buffers\\Test.txt");
        BufferedReader bReader = new BufferedReader(reader);
        
        int i;
        while((i=bReader.read())!=-1){
            System.out.print((char)i);
        }
       
        bReader.close();
        reader.close();
    }
}
