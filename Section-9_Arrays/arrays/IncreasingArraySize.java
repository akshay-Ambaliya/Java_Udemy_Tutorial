/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Dell
 */
public class IncreasingArraySize {
    public static void main(String[] args) {
        int[] arr = {10,20,30,45,58,56,74,85,97,99};
        int[] copy = new int[arr.length*2];
        
        System.out.println("Before : " +arr.length);
        
        for(int i=0;i<arr.length;i++){
            copy[i]= arr[i];
        }
        
        arr = copy;
        
        System.out.println("After : " +arr.length);
    }
}
