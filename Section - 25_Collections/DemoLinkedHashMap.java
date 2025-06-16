/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.LinkedHashMap;

/**
 *
 * @author Dell
 */
public class DemoLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(25, "Name1");
        lhm.put(15, "Name2");
        lhm.put(24, "Name3");
        lhm.put(20, "Name4");
        lhm.put(17, "Name5");
        
        System.out.println(lhm);
    }
}
