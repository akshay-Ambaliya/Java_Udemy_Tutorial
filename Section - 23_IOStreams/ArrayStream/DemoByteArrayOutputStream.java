/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayStream;

import java.io.ByteArrayOutputStream;

/**
 *
 * @author Dell
 */
public class DemoByteArrayOutputStream {
    public static void main(String[] args)throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream(10);
        bout.write(10);
        bout.write(20);
        bout.write(22);
        bout.write(35);
        
        byte[] b = bout.toByteArray();
        
        for(byte e:b){
            System.out.println(e);
        }
        
        bout.close();
    }
}
