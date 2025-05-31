/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author Dell
 */
public class Validation {
    public static void main(String[] args) {
        
        Validation.validate("Akshay");
        Validation.validate(75);
    }
    
    public static void validate(String name){
        String output = name.matches("^[A-Za-z]+$")?"Valid Name":"Invalid Name";
        System.out.println(output);
    }
    
    public static void validate(int age){
        if(age > 0 && age <100)
            System.out.println("Valid Age");
        else
            System.out.println("Invalid Age");
        
    }
}
