/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandeling;

/**
 *
 * @author Dell
 */
public class CatchBlock {
    
    public static void main(String[] args) {
        
        int[] arr = {5,10,15,20,0};
        try{
            System.out.println(arr[2]/arr[0]); // Runs Perfectly
            System.out.println(arr[2]/arr[4]); // ArithmeticException
            System.out.println(arr[2]/arr[5]); // ArrayIndexOutOfBoundsException
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        // Following method will handel both the exception
        
        try{
            
            System.out.println(arr[2]/arr[0]); // Runs Perfectly
            
            try{
                System.out.println(arr[2]/arr[5]); // ArithmeticException
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            System.out.println(arr[2]/arr[4]);  // ArrayIndexOutOfBoundsException
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
