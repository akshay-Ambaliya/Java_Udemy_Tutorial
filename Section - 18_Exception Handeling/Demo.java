/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandeling;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Demo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        try{
            System.out.println("Division of two number : "+ (num1/num2));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    
    
}
