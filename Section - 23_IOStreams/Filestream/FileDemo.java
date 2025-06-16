/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Filestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Dell
 */
public class FileDemo {
//    public static void main(String[] args) throws Exception {
//        
//        FileOutputStream fout = new FileOutputStream("D:\\java\\IOStream\\src\\Filestream\\Test.txt");
//        
//        byte[] arr = "Akshay".getBytes();
//        
//        for(byte b:arr)
//        fout.write(b);
//        
//        System.out.println("written Perfectly : ");
//        
//        FileInputStream fin = new FileInputStream("D:\\java\\IOStream\\src\\Filestream\\Test.txt");
//        
//        arr = fin.readAllBytes();
//        for(byte b:arr)
//        System.out.print((char)(b));
//        
//        System.out.println("\n");
//        
//        fout.close();
//        fin.close();
//        
//    }
    
    
    public static void main(String[] args) throws Exception {
        FileWriter fwrite = new FileWriter("D:\\java\\IOStream\\src\\Filestream\\Test.txt");
        
//        char[] name = {'a','k','s','h','a','y'};
//        
//        for(int c:name)
//        fwrite.write(c);

        String name = "akshay";
        fwrite.write(name);

        System.out.println("Written");
        
        
        
        
        FileReader fread = new FileReader("D:\\java\\IOStream\\src\\Filestream\\Test.txt");
        
        int c;
        while((c=fread.read())!=-1 )
        {
            System.out.print((char)c);
        }
        
        System.out.println("\n");
        
        fwrite.close();
        fread.close();
        
    }
}
