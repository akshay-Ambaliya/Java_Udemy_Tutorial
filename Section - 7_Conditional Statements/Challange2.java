/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditionalstatement;

/**
 *
 * @author Dell
 */
public class Challange2 {
    
    // 1. Find radix of a number given in a string
    // 2. Find a given year is a leap year
    
    public static void main(String[] args) {
        Challange2.isLeapYear(1900);
        Challange2.findRadix("256348");
    }
    
    public static void  isLeapYear(int year){
        if(year%400==0 || (year%100!=0 && year%4==0))
            System.out.println(year + " : Is a leap year");
        else
            System.out.println(year + " : Is not a leap year");
    }
    
    public static void findRadix(String num){
        if(num.matches("[0|1]+"))
            System.out.println("Binary number");
        else if(num.matches("[0-7]+"))
            System.out.println("Octal number");
        else if(num.matches("[0-9]+"))
            System.out.println("Decimal number");
        else if(num.matches("[0-9A-Ea-e]+"))
            System.out.println("Hexa Decimal number");

    }
}
