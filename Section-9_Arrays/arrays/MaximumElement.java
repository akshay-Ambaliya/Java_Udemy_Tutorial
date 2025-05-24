/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Dell
 */
public class MaximumElement {
    public static void main(String[] args) {
        int []arr = {15,48,75,96,32,10,22,15,54};
        
        int max=arr[0];
        for(int ele:arr){
            if(ele>max)
                max=ele;
        }
        
        System.out.println("Largest Element IS : " + max);
        
    }
}
