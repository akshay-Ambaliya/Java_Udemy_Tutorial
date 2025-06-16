/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayStream;

import java.io.ByteArrayInputStream;

/**
 *
 * @author Dell
 */
public class DemoByteArrayInputStream {
    
    public static void main(String[] args) throws Exception {
        byte[] arr = {124,25,36,74,85,11,23,54};
        ByteArrayInputStream bin = new ByteArrayInputStream(arr); 
        
        int temp;
        while((temp = bin.read())!=-1)
        {
            System.out.println((char)temp);
        }
        
    }
}
