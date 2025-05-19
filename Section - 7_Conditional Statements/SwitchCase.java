/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conditionalstatement;

/**
 *
 * @author Dell
 */
public class SwitchCase {
    public static void main(String[] args) {
        
        int n=3;
        
        if(n<=1)
            System.out.println("One");
        else if(n==2)
            System.out.println("Two");
        else if(n==3)
            System.out.println("Three");
        else
            System.out.println("Greater than Three");
        
        
        // We can use instead
        switch(n)
        {
            case 1:
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("two");
                break;
        }
    }
}
