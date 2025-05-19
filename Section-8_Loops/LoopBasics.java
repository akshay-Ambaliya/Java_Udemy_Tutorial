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
public class LoopBasics {
    
    public static void main(String[] args) {
        //LoopBasics.displayTable();
        //LoopBasics.displaySumTillN();
        //LoopBasics.findFactorial();
        //LoopBasics.displayDigits();
        LoopBasics.countDigits();
    }
    
    public static void displayTable(){
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(num + "  X  " + i +"  =  " + i*num);
        }
    }
    
    public static void displaySumTillN(){
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum=0;
        for(int i = 1;i<=num;i++)
        {
            sum +=i;
        }
        
        System.out.println("Sum till " +num + " is : "+sum);
    }
    
    public static void findFactorial(){
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        int result=1;
        for(int i=1;i<=num;i++){
            result *=i;
        }
        
        System.out.println("Factoral of " + num + " is : " + result);
    }
    
    public static void displayDigits(){
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        
        for(;num!=0;num/=10){
            System.out.println(num%10);
        }
    }
    
    public static void countDigits(){
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int counter = 0;
        
        while(num!=0){
            num/=10;
            counter++;
        }
        
        System.out.println(counter);
    }
}
