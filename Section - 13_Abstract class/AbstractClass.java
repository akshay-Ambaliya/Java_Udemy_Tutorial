/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractclass;

/**
 *
 * @author Dell
 */

abstract class Super{
    public Super(){
        System.out.println("Constructor of Super class : ");
    }
    
    public void meth(){
        System.out.println("Method of Super class : ");
    }
    
    abstract public void abstractMethod();
    //Absract method is a method without body / definition
    
}

class Sub extends Super{
    public void meth(){
        System.out.println("Method of super class");
    }
    
    public void abstractMethod(){
        System.out.println("This is a abstractMethod call from Sub class ");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Super sup = new Sub();
        sup.abstractMethod();
        sup.meth();
    }
    
}
