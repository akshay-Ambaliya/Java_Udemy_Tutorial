/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerClasses;

/**
 *
 * @author Dell
 */
public class OuterClass {
    
    public int x=20;
    public int y;
    
    public void show(){
        //System.out.println(innerX);         //Inaccessible
        System.out.println("Method from outer class : ");
    }
            
    public class InnerClass{
        public int innerX;
        public int innerY;
        
        public void innerShow(){
            System.out.println(x);      //accessible
            System.out.println("Method from inner class : ");
        }
    }
    
    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        inner.innerShow();
    }
}
