/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Series {
    public static void main(String[] args) {
        //Series.fibonacciSeries();
        //Series.APSeries();
        Series.GPSeries();
    }
    
    public static void fibonacciSeries(){
        int num1=0,num2=1,result=1;
        
        System.out.println("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        for(int i =0 ;i<n;i++){
            System.out.print(num1 + " ");
            num1 = num2;
            num2 = result;
            result=num1+num2;
        }
        
        
    }
    
    public static void APSeries(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter A : ");
        int a = scanner.nextInt();
        
        System.out.println("Enter D : ");
        int b = scanner.nextInt();
        
        System.out.println("Enter N : ");
        int n = scanner.nextInt();
        int result =a;
        
        for(int i=0;i<n;i++){
            System.out.print(result + " ");
            result+=b;
        }
        
    }
    
    public static void GPSeries(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter A : ");
        int a = scanner.nextInt();
        
        System.out.println("Enter R : ");
        int r = scanner.nextInt();
        
        System.out.println("Enter N : ");
        int n = scanner.nextInt();
        int result =a;
        
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.print(result + " ");
            result*=r;
        }
    }
}
