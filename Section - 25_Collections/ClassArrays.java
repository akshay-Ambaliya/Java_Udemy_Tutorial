/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Dell
 */

class Compare implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       if(o1<o2)return 1;
       if(o1>o2) return -1;
       else return 0;
    }
}

public class ClassArrays {
    public static void main(String[] args) {
        Integer[] arr = {20,30,25,60,55,70};
        int[] arr2 = {50,55,74,88,42,12};
        Arrays.sort(arr, new Compare());
        
        
        for(int ele:arr){
            System.out.println(ele+" ");
        }
    }
}
