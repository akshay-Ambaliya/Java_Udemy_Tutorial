/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Dell
 */
public class ArraySum {
    public static void main(String[] args) {
        //find Sum of all element of an array
        
        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 55;
        arr[4] = 78;
        arr[5] = 56;
        arr[6] = 39;
        arr[7] = 24;
        arr[8] = 60;
        arr[9] = 17;
        
        int sum=0;
        for(int ele:arr){
            sum+=ele;
        }
        
        System.out.println("Sum of all element in array Is : " + sum);
        
    }
}
