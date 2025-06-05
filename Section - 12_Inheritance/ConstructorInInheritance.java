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
}

class Child extends Parent{
    
    public Child(){
        System.out.println("Child Constructor : ");
    }
}

class Grandchild extends Child{
    public Grandchild(){
        System.out.println("Grandchild Constructor : ");
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        Grandchild  gc = new Grandchild();
        System.out.println("\n");
        
        Child  c = new Child();
        System.out.println("\n");
        
        Parent  p = new Parent();
        System.out.println("\n");
    }
}
