/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generics;

/**
 *
 * @author Dell
 */
public class Excercise<T>{
        
    public T element;

    public Excercise() {
    }
    
    
    public static void main(String[] args) {
        Excercise<String> demo = new Excercise<>();
        demo.element = "Akshay";
        
        Excercise<Integer> intDemo = new Excercise<>();
        intDemo.element = 20;
        
        
        System.out.println(demo.element);
        System.out.println(intDemo.element);
    }
}
