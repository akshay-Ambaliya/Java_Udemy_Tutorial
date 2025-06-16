/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.*;

/**
 *
 * @author Dell
 */
public class DemoTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(20, 25, 48, 59, 63, 52));

        System.out.println(ts);

        ts.add(28);
        System.out.println(ts);
    }
}
