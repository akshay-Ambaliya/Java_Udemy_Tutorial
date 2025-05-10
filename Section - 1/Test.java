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

// Taking Input 
public class Test {
    public static void main(String[] args) {        
        
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name : ");
        String str = scanner.nextLine();
        System.out.println(str);

        
        System.out.println("Enter number 1");
        a = scanner.nextInt();
        
        System.out.println("Enter number 2");
        b = scanner.nextInt();
        c = a+b;
           
        System.out.println("Number 1 : "+ a);
        System.out.println("Number 2 : "+ b);
        System.out.println("Sum : "+ c);

        scanner.useRadix(8);
        int x= scanner.nextInt();
         
        System.out.println(x);
    }
}

