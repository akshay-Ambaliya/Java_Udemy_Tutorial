/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package var_arg;

/**
 *
 * @author Dell
 */
public class Maximum {
     public static void main(String[] args) {
        System.out.println(Maximum.findMax(11,12,45,87,85,46,35,22));
    }
    
    public static int findMax(int... arr){
        int max = arr[0];
        
        for(int ele:arr){
            if(max < ele){
                max=ele;
            }
        }
        
        return max;
    }
}
