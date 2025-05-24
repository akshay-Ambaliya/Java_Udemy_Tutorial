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
public class ArrayInsertion {
    public static void main(String[] args) {
        int []arr = new int[10];
        arr[0] = 12;
        arr[1] = 45;
        arr[2] = 68;
        arr[3] = 87;
        arr[4] = 90;
        arr[5] = 13;
        
        int n =6;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter position and element");
        
        int pos = scanner.nextInt();
        int ele = scanner.nextInt();
        for(int i=n;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        
        arr[pos]=ele;
        
        System.out.println("Array : ");
            
        for(int i=0;i<n+1;i++){
            System.out.print(" "+arr[i]);
        }

        System.out.println("\n");
    }
}
