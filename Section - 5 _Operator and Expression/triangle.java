/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Dell
 */
public class triangle {
    public static void main(String[] args) {
        System.out.println((triangle.calculateTriangle(25, 4)));
    }
    
    public static double calculateTriangle(double b,double h){
        return ((double)1/2)*b*h;
    }
}
