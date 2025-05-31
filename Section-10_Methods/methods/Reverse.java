/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methods;

/**
 *
 * @author Dell
 */
public class Reverse {
    public static void main(String[] args) {
        Reverse.reverseElement(124563);
        Reverse.reverseElement(new int[]{10,25,34,69,87,45});
    }
    
    public static void reverseElement(int num[]){
        int temp;
        for(int i=num.length-1,j=0;i>j;i--,j++){
            temp = num[j];
            num[j] = num[i];
            num[i] = temp;
        }
        
        System.out.println("Array : \n");
        for(int ele:num){
            System.out.print(ele +"\t");
        }
        
    }
    
    public static void reverseElement(int num){
        
        int sum=0,rem;
        
        System.out.println("Actual Element : " + num);
        while(num!=0){
            sum*=10;
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        
        System.out.println("Reversed Element : " + sum);
    }
    
    
}
