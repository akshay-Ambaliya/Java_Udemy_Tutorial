/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

class Circle{
    private int radius = 10;
    
    public double area(){
        return (double)radius*3.14*3.14;
    }
    
    public double perimeter(){
        return (double)radius*3.14*2;
    }
}

class Rectangle{
 
    private int length = 20;
    private int breath = 25;
    
    public int area(){
        return length*breath;
    }
    
    public int perimeter(){
        return 2*(length+breath);
    }
}


public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        
        System.out.println("Area of Circle : "+ circle.area());
        System.out.printf("Perimeter of Circle : %5.2f\n", circle.perimeter());
        
        Rectangle rect = new Rectangle();
        
        System.out.println("Area of Rectangle : "+ rect.area());
        System.out.println("Perimeter of Rectangle : "+ rect.perimeter());
        
    }
}
