/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ArrayDeletion {
    
    public static void main(String[] args) {
    
        int []arr = new int[10];
        arr[0] = 12;
        arr[1] = 45;
        arr[2] = 68;
        arr[3] = 87;
        arr[4] = 90;
        arr[5] = 13;
        
        int n=6;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter position");

        int pos = scanner.nextInt();
       
        for(int i=pos;i<n;i++){
            arr[i]=arr[i+1];
        }
        
        
        System.out.println("Array : ");
            
        for(int element:arr){
            System.out.print(" "+element);
        }

        System.out.println("\n");
    }
    
}
