/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.io.FileInputStream;
import java.util.StringTokenizer;

/**
 *
 * @author Dell
 */
public class DemoStringTokenizer {
    public static void main(String[] args) throws Exception{
        String s = "Company=Tata;Color=Red;Model=Nano";
        
        StringTokenizer stk = new StringTokenizer(s,"=;");
        
        while(stk.hasMoreElements())
            System.out.println(stk.nextElement());
                    
        FileInputStream fin  = new FileInputStream("D:\\java\\Collection\\src\\collection\\Test.txt");
        byte[] b=new byte[fin.available()];
        fin.read(b);
        String data = new String(b);
        
        StringTokenizer stk2 = new StringTokenizer(data,",");
        
        while(stk2.hasMoreElements())
            System.out.println(stk.nextElement());
    }
}
