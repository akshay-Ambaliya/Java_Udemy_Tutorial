/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package var_arg;

/**
 *
 * @author Dell
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println(Sum.findSum(12,25,48,596,74,42));
    }
    
    public static int findSum(int...num){
        int sum=0;
        
        for(int ele:num){
            sum+=ele;
        }
        return sum;
    }
}
