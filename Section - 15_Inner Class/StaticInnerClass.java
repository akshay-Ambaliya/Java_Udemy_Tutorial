/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerClasses;

/**
 *
 * @author Dell
 */

class Outer {
    
    static int outerStatic = 10;
    int outerIntance = 50;
    static class Inner {
        public void show(){
            System.out.println(outerStatic);
            //System.out.println(outerInstance);// Invalid
            //Because it can only access Static variable of outer class 
        }
    }
}

public class StaticInnerClass {
    public static void main(String[] args) {
        //How to create object 
        
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
