/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayStream;

import java.io.CharArrayWriter;

/**
 *
 * @author Dell
 */
public class DemoCharArrayWriter {
 
    public static void main(String[] args) throws Exception{
        CharArrayWriter writer = new CharArrayWriter(10);
        
        writer.write(65);
        writer.write(75);
        writer.write(99);
        writer.write(101);
        writer.write(24);
        writer.write(70);
        
        char[] c = writer.toCharArray();
        
        for(char element:c){
            System.out.println(element);
        }
    }
}
