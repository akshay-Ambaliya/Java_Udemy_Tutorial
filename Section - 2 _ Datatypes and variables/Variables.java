/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;


import java.util.Scanner;

/**
 *
 * @author Dell
 */


public class Test {
    public static void main(String[] args) {        
        
//  : Rules to create an Variables
//        1. Case Sensitive

                int student;
                int Student;
                
//        2. Contains Alphabets,Numbers,_ or $
                
                int student03;
                int student_divA;
                
//        3. Starts with Alphabets,_ or $
                
                int employee;
                int _employee;
                int $employee;
                int 1employee; // Invalid
                int employee1; // valid
                
//        4. Should not be a keyword
                
                int null; // invalid
                int void; // invalid
                
//        5. Should not be a class name, If class is in use
                
                int String; // valid
                int Float;  // valid but not recommended
                
//        6. No limit on length of name

                int employee01FinanceDepartment;
                
//        7. Follow Camel Case
                
                int employee02FinanceDepartment;
                
    }
}

