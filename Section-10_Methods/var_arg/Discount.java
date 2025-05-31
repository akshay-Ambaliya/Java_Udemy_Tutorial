/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package var_arg;

/**
 *
 * @author Dell
 */
public class Discount {
    public static void main(String[] args) {
        Discount.calcDiscount(250,475,520,42.5,155);
    }
    
    public static void calcDiscount(double...prices){
        double discount=0;
        double sum=0;
        
        for(double ele:prices){
            sum+=ele;
        }
        
        if(sum >= 1000)
            discount=15;
        else if(sum>=800)
            discount=10;
        else if(sum>=500)
            discount=5;
        
        System.out.println("Total : "+ sum);
        System.out.println("Discount : "+ discount + "%");
        System.out.println("Final Price : "+ (sum-(sum*discount)/100));
         
    }
}
