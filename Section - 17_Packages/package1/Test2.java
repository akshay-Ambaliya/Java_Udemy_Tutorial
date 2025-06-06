/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author Dell
 */
public class Test2 extends Test1{
    
    @Override
    public void display(){
        System.out.println("public : " + publicNumber); //Accessible
        //System.out.println("private : "+privateNumber); //Inaccessible
        System.out.println("default : "+defaultNumber); //Accessible
        System.out.println("protected : "+protectedNumber); //Accessible
    }
}

class Temp{
    public static void main(String[] args) {
        Test1 test = new Test1(12,25,48,69);
        System.out.println(test.defaultNumber);
        System.out.println(test.protectedNumber);
        System.out.println(test.publicNumber);
//        System.out.println(test.privateNumber); //Inaccessible
    }
    
}
