/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticandfinal;

class Test{

    public Test(){
        System.out.println("Constructor");
    }
    static{
        System.out.println("First Static Block Executed : ");
    }
    static{
        System.out.println("Second Static Block Executed : ");
    }

}
public class StaticBlock {
    public static void main(String[] args) {
        Test t = new Test();
    }
}
