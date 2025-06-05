/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InnerClasses;

/**
 *
 * @author Dell
 */

interface Test{
    void method1();
    void method2();
}

public class AnonymousInnerClass {
    
        public static void main(String[] args) {
                Test test = new Test(){
            public void method1(){
                System.out.println("Hello from Method1");
            }

            public void method2(){
                System.out.println("Hello from Method2");
            }
        };
        test.method1();
    }
}
