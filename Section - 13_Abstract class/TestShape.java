/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author Dell
 */

abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape{
    
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}

class Rectangle extends Shape{
    int length,width;
    
    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }
    
    public double perimeter()
    {
        return 2*(length+width);
    }
    public double area()
    {
        return length*width;
    }
}
public class TestShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10,25);
        Circle circle = new Circle(15);
        System.out.printf("\nArea Of Circle : %5.2f",circle.area());
        System.out.println("\nPerimeter Of Circle : "+circle.perimeter());
        System.out.printf("\nArea Of Rectangle : %5.2f",rect.area());
        System.out.println("\nPerimeter Of Rectangle :"+rect.perimeter());
    }
}
