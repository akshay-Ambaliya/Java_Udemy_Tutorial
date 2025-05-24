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
public class SearchElement {
    public static void main(String[] args) {
        
        int []arr = {15,48,75,96,32,10,22,15,54};
        System.out.println("Enter element to search : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(num == arr[i])
                index = i;
        }
        
        if(index == -1)
            System.out.println("Not is the array");
        else
            System.out.println(num + " Is at " +index+ " Index");
    }
}
