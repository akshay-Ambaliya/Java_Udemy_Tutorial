/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Dell
 */
public class GenericMethods {
    
    static public <T extends Number> double sum(T ele1,T ele2){
        return ele1.doubleValue()+ele2.doubleValue();
    }
    
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(147.5,15.3));
        
    }
}
