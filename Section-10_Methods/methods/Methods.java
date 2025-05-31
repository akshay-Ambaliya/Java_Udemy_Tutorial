/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methods;

/**
 *
 * @author Dell
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hii");
        Methods.max(10, 15);
    }
    
    static void max(int a,int b){
        System.out.println((a>b?a:b)+ " Is a larger number");
    }
}
