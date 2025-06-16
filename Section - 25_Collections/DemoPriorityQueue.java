/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Dell
 * 
 * 
 */

class MyComparator implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        if(o1>o2) return -1;
        if(o1<o2) return 1;
        return 0;
    }
}

public class DemoPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());
        
        pq.add(10);
        pq.add(45);
        pq.add(35);
        pq.add(30);
        pq.add(15);
        System.out.println(pq);
        
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq.poll());
        System.out.println(pq);
        
    }
}
