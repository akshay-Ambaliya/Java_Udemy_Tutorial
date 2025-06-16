/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iostream;

import java.io.RandomAccessFile;

/**
 *
 * @author Dell
 */
public class DemoRAF {
    public static void main(String[] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("D:\\java\\IOStream\\src\\iostream\\Test.txt","rw");
        
        System.out.print((char)raf.read());
        System.out.print((char)raf.read());
        System.out.print((char)raf.read());
        System.out.print((char)raf.read());
        raf.seek(5);
        raf.writeChar('A');
        System.out.print((char)raf.read());
        System.out.print((char)raf.read());
        
        raf.skipBytes(3);
        System.out.print((char)raf.read());
        
        raf.seek(raf.getFilePointer()-2);
        System.out.print((char)raf.read());
        System.out.print((char)raf.read());
        
        
        
        System.out.println("\n");
        
        raf.close();
                
    }
}
