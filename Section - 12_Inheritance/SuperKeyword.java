/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
class Parent{
    
    public Parent(){
        System.out.println("Parent Constructor : ");
    }
    
    public Parent(int x){
        System.out.println("Parent Constructor with "+x);
    }
}

class Child extends Parent{
    
    public Child(){
        System.out.println("Child Constructor : ");
    }
    
    public Child(int x){
        super(x);
        System.out.println("Child Constructor with "+x);
    }
}

class Grandchild extends Child{
    public Grandchild(){
        System.out.println("Grandchild Constructor : ");
    }
    
    public Grandchild(int x){
        super(x);
        System.out.println("Grandchild Constructor with "+x);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        
        Grandchild  gc = new Grandchild(25);
        System.out.println("\n");
        
        Child  c = new Child(36);
        System.out.println("\n");
        
        Parent  p = new Parent(14);
        System.out.println("\n");
    }
}
