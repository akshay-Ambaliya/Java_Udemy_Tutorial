/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Dell
 */
public class DemoHashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        
        ht.put(1, "Akshay");
        ht.put(3, "Hitesh");
        ht.put(4, "Manoj");
        
        System.out.println(ht);
        
        Enumeration em =ht.elements();
        while(em.hasMoreElements()){
            System.out.println(em.nextElement());
        }
        
        
        ht.compute(1,(k,v)->v+" Ambaliya");
        
        System.out.println(ht);
        
        ht.computeIfAbsent(2, (v)->v+"Khushi");
        System.out.println(ht);
    }
}
