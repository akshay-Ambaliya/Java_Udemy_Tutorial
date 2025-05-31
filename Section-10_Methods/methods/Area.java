/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author Dell
 */
public class Area {
    public static void main(String[] args) {
        Area.calculateArea(25.5);
        Area.calculateArea(5);
        Area.calculateArea(24, 36.5);
    }
    
    public static void calculateArea(int radius){
        System.out.println("Area of circle is : " + ((double)radius*radius*3.14));
    }
    
    public static void calculateArea(double length,double width){
        System.out.println("Area of Rectangle is : " + (length*width));
    }
    
    public static void calculateArea(double length){
        System.out.println("Area Of square : "+(length*length));
    }
    
}




