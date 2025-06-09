/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandeling;

/**
 *
 * @author Dell
 */
public class FinallyBlock {
    
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }
        finally
        {
            System.out.println("Finally Block");
        }
    }
}
