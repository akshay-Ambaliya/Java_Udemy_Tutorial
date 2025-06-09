/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandeling;

import java.util.Scanner;


class NegativeHeightException extends Exception{
  
    @Override
    public String toString(){
        return "Height cannot be negative";
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter height and width : ");
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        
        try{
            if(height < 0)
            throw new NegativeHeightException();
            
            System.out.println(height + " " +width);
        }catch(NegativeHeightException e){
            System.out.println(e);
        }
    }
}
