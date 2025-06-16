/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayStream;

import java.io.CharArrayReader;

/**
 *
 * @author Dell
 */
public class DemoCharArrayReader {
    public static void main(String[] args) throws Exception {
        
        char[] c = {'a','k','s','h','a','y'};
        CharArrayReader reader = new CharArrayReader(c);
        
        int i;
        while((i=reader.read()) != -1)
        {
            System.out.print((char)i);
        }
    }
}
