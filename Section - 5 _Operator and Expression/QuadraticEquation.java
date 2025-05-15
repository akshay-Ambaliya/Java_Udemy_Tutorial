/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Dell
 */
public class QuadraticEquation {
    public static void main(String[] args) {
        
        QuadraticEquation.findR1(1,5,6);        
    }
    
    
    public static void findR1(int a,int b,int c){
        int result = (b*b)-(4*a*c);
        int r1 = (int)((b*-1) + Math.sqrt(result))/(2*a);
        int r2 = (int)((b*-1) - Math.sqrt(result))/(2*a);
        System.out.println(r1 + " " + r2);
        
    }
    
}
