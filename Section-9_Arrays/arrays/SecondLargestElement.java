/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Dell
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        int []arr = {15,54,75,96,32,10,98,15,55};
        
        int max1=0,max2=0;
        
        for(int ele:arr){
            if(ele>max1){
                max2=max1;
                max1=ele;
            }
            else if(ele>max2)
                max2=ele;
        }
        System.out.println("Largest Element : " + max1);
        System.out.println("Second Largest Element : "+ max2);
    }
}
