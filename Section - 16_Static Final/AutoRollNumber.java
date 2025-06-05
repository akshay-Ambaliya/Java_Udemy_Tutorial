/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticandfinal;

/**
 *
 * @author Dell
 */

class Student{
    int rollNumber;
    static int count=0;
    String name;
    int age;
    
    public Student(String name,int age){
        rollNumber = ++count;
        this.name = name;
        this.age = age;
    }
    
    public int getRollNumber(){
        return rollNumber;
    }
}

public class AutoRollNumber {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        Student arr[] = {new Student("Akshay",18),
                         new Student("Deep",19),
                         new Student("Aryan",20)};
        
        for(Student student:arr){
            System.out.println(student.rollNumber+"\t"+student.name+"\t"+student.age);
                    
        }
               
        
        
    }
}
