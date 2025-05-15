/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Dell
 */
public class Triangle2 {
    public static void main(String[] args) {
        System.out.println(Triangle2.calculateArea(34,32,67));
    }
    
    public static double calculateArea(double sideA,double sideB, double sideC){
        
        double s = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        
        return area;
    }
}
