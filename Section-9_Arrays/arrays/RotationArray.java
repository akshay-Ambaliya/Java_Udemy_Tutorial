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
public class RotationArray {
    
    public static void main(String[] args) {
        int []arr = {15,54,75,96,32,10,98,15,55};
        
        System.out.println("Select Rotation : ");
        System.out.println("1 . Left");
        System.out.println("2 . Right");
        Scanner scanner = new Scanner(System.in);
        
        int choice  = scanner.nextInt();
        
        if(choice == 1){
            int last = arr[arr.length-1];
            
            for(int i=arr.length-1;i>=1;i--){
                arr[i] = arr[i-1];
            }
            arr[0]=last;
            System.out.println("Array : ");
            
            for(int ele:arr){
                System.out.print(" "+ele);
            }
            
            System.out.println("\n");
        }
        else{
            int first = arr[0];
            
            for(int i=1;i<arr.length;i++){
                arr[i-1] = arr[i];
            }
            
            arr[arr.length-1] = first;
            
            System.out.println("Array : ");
            
            for(int ele:arr){
                System.out.print(" "+ele);
            }
            
            System.out.println("\n");
            
        }
    }   
}
