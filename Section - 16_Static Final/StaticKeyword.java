/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticandfinal;


class Test{
    static int num =20;
    int num2 =20;
    
    void show(){
        System.out.println(num + " " + num2);
    }
    
    static void display(){
        System.out.println(num);
    }
}


public class StaticKeyword {
    public static void main(String[] args) {
        Test test = new Test();
        test.show();
        test.num = 22;
        
        Test test2 = new Test();
        
        System.out.println(test2.num);         
        
        Test.display();
    }
}
