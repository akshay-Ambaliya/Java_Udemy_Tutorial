/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Dell
 */
public class CopyingArray {
    
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,45,58,56,74,85,97,99};
        int[] copy = new int[10];
        
        for(int i=0;i<arr.length;i++){
            copy[i]= arr[i];
        }
        
        System.out.println("arr : ");
        for(int x1:arr){
            System.out.print(" "+x1);
        }
        
         System.out.println("\ncopy : ");
        for(int x1:copy){
            System.out.print(" "+x1);
        }
    }
}
