/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.ArrayDeque;

/**
 *
 * @author Dell
 */
public class DemoDequeue {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offerLast(10);
        ad.offerLast(20);
        ad.offerLast(30);
        ad.offerLast(40);
        ad.add(50);
        System.out.println(ad);
        ad.addLast(26);
        System.out.println(ad);
        ad.addFirst(33);
        System.out.println(ad);
        
        ad.pollFirst();
        System.out.println(ad);
        
        ad.removeLast();
        System.out.println(ad); 
    }
}
