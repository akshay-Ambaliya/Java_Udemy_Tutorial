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
public class DemoBufferWriter {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("D:\\java\\IOStream\\src\\Buffers\\Test.txt");
        BufferedWriter bWriter = new BufferedWriter(writer);
            
        String str = "Hello To akshay";
        bWriter.write(str);
        
        bWriter.close();
        writer.close();
        
    }
}
