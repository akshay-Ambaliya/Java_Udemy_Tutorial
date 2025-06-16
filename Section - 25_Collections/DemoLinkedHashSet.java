/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.LinkedHashSet;

/**
 *
 * @author Dell
 */
public class DemoLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(25);
        lhs.add(32);
        lhs.add(15);
        lhs.add(10);
        lhs.add(58);
        lhs.add(10);
        
        lhs.forEach(System.out::println);
    }
}
