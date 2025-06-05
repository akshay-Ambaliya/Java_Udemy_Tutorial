/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticandfinal;

/**
 *
 * @author Dell
 */

class Test{
    public final void show(){
        System.out.println("This is message from fianl method");
    }
}

class SubTest extends Test{
//    public void show();// Invalid
    
}


public class FinalKeyword {
    public static void main(String[] args) {
        final double PI = 3.14;
        System.out.println(PI);
        Test  test =  new Test();
        test.show();
    }
}
