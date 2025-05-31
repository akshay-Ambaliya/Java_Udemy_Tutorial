/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter any number : ");
        int num = new Scanner(System.in).nextInt();
        if(isPrime(num))
            System.out.println(num + " number is prime number : ");
        else
            System.out.println(num + " number is not prime number : ");
    }
    
    public static boolean isPrime(int num)
    {
        for(int i=2;i<num;i++){
            if(num%i ==0)
            {
                return false;
            }
        }
        
        return true;
    }
}
