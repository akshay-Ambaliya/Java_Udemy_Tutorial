/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionalstatement;

/**
 *
 * @author Dell
 */
public class ConditionalStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a=5,b=20,c=15;
        if(a>b){
            if(a>c)
            System.out.println(a + " Is largest number");
            else{
                if(b>c){
                    System.out.println(b + " Is largest number");
                }
                else{
                    System.out.println(c + " Is largest number");
                }
            }
        }
        
        //This can also be done by ternary operator
        System.out.println((a>b?(a>c?a:c):((b>c)?b:c)) + " Is largest");
       
    }
}
