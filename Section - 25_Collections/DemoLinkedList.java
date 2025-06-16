/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class DemoLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> al = new LinkedList<>();
        al.add(10);
        System.out.println(al);
        
        al.add(20);
        System.out.println(al);
        
        al.add(1, 25);
        System.out.println(al);
        
        System.out.println(al.get(1));
        al.set(1, 50);
        
        System.out.println(al);
        
        LinkedList<Integer> al2 = new LinkedList<>(List.of(10,20,36,54,5));
        
        al.addAll(al2);
        
        System.out.println(al);
        
        //ways To interate through list
        
        System.out.println("Using for loop : ");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+ " ");
        }
        
        System.out.println("\n\nUsing for each loop : ");
        for(Integer ele:al){
            System.out.print(ele+" ");
        }
        
        System.out.println("\n\nUsing Iterable : ");
        Iterator<Integer> iterable = al.iterator();
        
        while(iterable.hasNext()){
            System.out.print(iterable.next()+ " ");
        }
        
        System.out.println("\n\n Using Foreach method : ");
        al.forEach(System.out::println);
                
    }   
}
