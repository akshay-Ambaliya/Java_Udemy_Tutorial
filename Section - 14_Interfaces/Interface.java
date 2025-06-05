/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Dell
 */

interface Test{
    
    // Interface can contain default and private method
    
    void method1();
    void method2();
    default void method3(){
        System.out.println("Default method call");  
        method4();
    }
    
    
    private void method4(){
        System.out.println("Private method call : ");
    }
}

class SubClass implements Test{
    
    public SubClass(){
        method1();
        method2();
        method3();
    }
    public void method1(){
        System.out.println("Hello : from method 1 ->");
    }
    
    public void method2(){
        System.out.println("Hello : from method 2 ->");
    }
}

class Interface2 extends Interface{
    // Note : Interface is extended by another interfae not implemented
}

public class Interface {
    public static void main(String[] args) {
        Test test= new SubClass();
    }
}
