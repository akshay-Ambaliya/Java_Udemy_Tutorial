/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;
import package1.Test1;


public class Test3 extends Test1{
    @Override
    public void display(){
        System.out.println("public :" + publicNumber);
//        System.out.println("private :" + privateNumber); //Inaccessible
//        System.out.println("default : "+defaultNumber);  //Inaccessible
        System.out.println("protected : "+protectedNumber);
    }
    
    public static void main(String[] args) {
        Test1 test = new Test1(12,25,48,69);
        System.out.println("public : "+test.publicNumber);
//        System.out.println("private :" + test.privateNumber); //Inaccessible
//        System.out.println("default : "+test.defaultNumber); //Inaccessible
//        System.out.println("protected : "+test.protectedNumber); //Inaccessible
        
    }
}

