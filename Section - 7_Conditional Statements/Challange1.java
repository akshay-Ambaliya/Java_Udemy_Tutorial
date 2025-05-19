/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditionalstatement;

/**
 *
 * @author Dell
 */
public class Challange1 {
    // 1. Find a number is odd or even
    // 2. Find person is young ot not
    // 3. Find grades for given marks
    
    public static void main(String[] args) {
        Challange1.isEven(15);
        Challange1.isYoung(25);
        Challange1.assignGrade(75);
    }
    
    public static void isEven(int num){
        System.out.println(""+num + (num%2==0?" : Is Even" : " : Is Odd"));
    }
    
    public static void isYoung(int age){
        if(age>=18)
            System.out.println("Young person");
        else
            System.out.println("Not an Young person");
    }
    
    public static void assignGrade(int marks){
        if(marks > 100 && marks<0)
            System.out.println("Invalid Marks");
        else if(marks >= 85)
            System.out.println(marks + " : A grade");
        else if(marks >= 70)
            System.out.println(marks + " : A grade");
        else if(marks >= 55)
            System.out.println(marks + " : A grade");
        else if(marks >= 40)
            System.out.println(marks + " : A grade");
        else
            System.out.println(marks + " : Fail");
        
    }
    
}
