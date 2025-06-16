/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author Dell
 */
public class DemoTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        
        tm.put(1, "Akshay");
        tm.put(2, "Khushi");
        tm.put(3, "Aryan");
        tm.put(5, "Manoj");
        tm.put(4, "Hitesh");
        tm.put(4, "Kevil");
        
        System.out.println(tm.get(3));
        
        System.out.println(tm);
        Entry<Integer,String> entry = tm.ceilingEntry(1);
        
        System.out.println(entry.getKey() + " " + entry.getValue());
        
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        
        hm.put(1, "Akshay");
        hm.put(2, "Khushi");
        hm.put(3, "Aryan");
        hm.put(5, "Manoj");
        hm.put(4, "Hitesh");
        
        System.out.println(tm.get(3));
        
        hm.forEach((key,value) -> System.out.println("Key="+key+" "+"Value = "+value));
        
    }
}
