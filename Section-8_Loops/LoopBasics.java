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
        //LoopBasics.countDigits();
        //LoopBasics.displayNumberInWords();
        //LoopBasics.reverseNumber();
        //LoopBasics.isPalindrome();
        LoopBasics.isArmstrong();
        
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
    
    public static void displayNumberInWords()
    {
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        int rem;
        
        while(num!=0){
            rem = num%10;
            System.out.println("");
            switch(rem){
                case 1:
                    System.out.print(" One");
                break;
                case 2:
                    System.out.print(" Two");
                break;
                case 3:
                    System.out.print(" Three");
                break;
                case 4:
                    System.out.print(" Four");
                break;
                case 5:
                    System.out.print(" Five");
                break;
                case 6:
                    System.out.print(" Six");
                break;
                case 7:
                    System.out.print(" Seven");
                break;
                case 8:
                    System.out.print(" Eight");
                break;
                case 9:
                    System.out.print(" Nine");
                break;
                case 0:
                    System.out.print(" Zero");
                break;
                default:
                    System.out.print(" Invalid number");
                break;
                
            }
            num/=10;
        }
    }
    
    public static void reverseNumber(){
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        int rem,result=0;
        
        while(num!=0){
            result*=10;
            rem = num%10;
            result+=rem;
            num/=10;
        }
        
        System.out.println("Reversed Number " + result);
    }
    
    public static void isPalindrome(){
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int rem,result=0,temp = num;
        
        while(temp!=0){
            result*=10;
            rem = temp%10;
            result+=rem;
            temp/=10;
        }
        
        if(result == num)
            System.out.println("Palindrome number");
        else
            System.out.println("Not an palindrome number");
    }
    
    public static void isArmstrong(){
        System.out.println("Please Enter any number  : ");
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp=num,counter = 0;
        
        while(temp!=0){
            temp/=10;
            counter++;
        }
        
        temp=num;
        int digit,result,sum=0;
        
        while(temp!=0){
            digit=temp%10;
            result=1;
            for(int i = 0;i<counter;i++){
                result*=digit;
            }
            sum+=result;
            temp/=10;
        }

        if(sum == num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrongnumber");
        
    }
}
