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

class Student implements Serializable{
    public int rollNo;
    public int age;
    public String name;
    public String division;
    public double percentage;

    public Student(int rollNo, int age, String name, String division, double percentage) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.division = division;
        this.percentage = percentage;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return  "rollNo=" + rollNo + ", age=" + age + ", name=" + name + ", division=" + division + ", percentage=" + percentage;
    }
}


public class ObjectSerialization {
//    public static void main(String[] args) throws Exception {
//        FileOutputStream fout = new FileOutputStream("D:\\java\\IOStream\\src\\Serialization\\Test.txt");
//        ObjectOutputStream oout = new ObjectOutputStream(fout);
//        
//        Student s = new Student(1,20,"Kevil","B",85.3);
//        
//        oout.writeObject(s);
//        
//        oout.close();
//        fout.close();
//    }
//    
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("D:\\java\\IOStream\\src\\Serialization\\Test.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        
        Student s = (Student)oin.readObject();
        
        System.out.println(s);
        oin.close();
        fin.close();
    }
}
