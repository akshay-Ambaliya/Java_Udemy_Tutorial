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


public class DemoDataInput_DataOutput {
//    public static void main(String[] args) throws Exception{
//        
//        FileOutputStream fout = new FileOutputStream("D:\\java\\IOStream\\src\\Serialization\\Test.txt");
//        DataOutputStream dout = new DataOutputStream(fout);
//        
//        Student s = new Student(1,19,"Akshay");
//        
//        dout.writeInt(s.rollNo);
//        dout.writeInt(s.age);
//        dout.writeUTF(s.name);
//        
//        dout.close();
//        fout.close();
//    }
    

    public static void main(String[] args) throws Exception{
        
        FileInputStream fin = new FileInputStream("D:\\java\\IOStream\\src\\Serialization\\Test.txt");
        DataInputStream din = new DataInputStream(fin);
        
        Student s = new Student();
        
        s.rollNo = din.readInt();
        s.age = din.readInt();
        s.name = din.readUTF();
        
        
        System.out.println(s.rollNo + "\n"+s.age + "\n" + s.name);
        fin.close();
        din.close();
    }
}
