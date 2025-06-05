/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class Circle{
    private int radius;
    
    public Circle(int radius){
        this.radius = radius;
    }
    
    public Circle(){
        radius = 0;
    }
    
    public double area(){
       return radius * 3.14 *radius;
    }
    
    public double perimeter(){
        return 2* 3.14 *radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
}

class Cylinder extends Circle {
    int height;
    
    public Cylinder(int height,int radius){
        super(radius);
        this.height = height; 
    }
    
    public double volume(){
        return 3.14 * getRadius() * getRadius() *height;
    }
}
public class TestShape {
    
    public static void main(String[] args) {
        Circle circle = new Circle(25);
        
        System.out.println("Circle Area : "+ circle.area());
        System.out.println("Circle Perimeter : "+ circle.perimeter());
        
        
        
        Cylinder cylinder = new Cylinder(40,36);
        
        System.out.println("Cylinder Volume : " + cylinder.volume());
        
    }
}
