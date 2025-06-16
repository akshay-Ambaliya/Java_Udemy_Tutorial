/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialization;

import java.io.*;

/**
 *
 * @author Dell
 */

class Student{
    public int rollNo;
    public int age;
    public String name;

    public Student(int rollNo, int age, String name) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
    }

    public Student() {
    }
}


public class PrintStreamDemo {
//    public static void main(String[] args) throws Exception{
//        FileOutputStream fout = new FileOutputStream("D:\\java\\IOStream\\src\\Serialization\\Test.txt");
//        PrintStream ps = new PrintStream(fout);
//        
//        Student s = new Student(1,19,"Akshay");
//        
//        ps.println(s.rollNo);
//        ps.println(s.age);
//        ps.println(s.name);
//        
//    }
    
    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("D:\\java\\IOStream\\src\\Serialization\\Test.txt");
        BufferedReader bfin = new BufferedReader(new InputStreamReader(fin));
        
        
        
        
        Student s = new Student();
        s.rollNo = Integer.parseInt(bfin.readLine());
        s.age = Integer.parseInt(bfin.readLine());
        s.name = bfin.readLine();
        
        System.out.println(s.rollNo+" "+s.age+" "+s.name);
    }
}
