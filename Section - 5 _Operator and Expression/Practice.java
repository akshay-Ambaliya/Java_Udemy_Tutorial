/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Dell
 */
public class Practice {
    public static void main(String[] args) {
//        Practice.prac30();
         // Practice.prac35();
         Practice.prac38();
    }
    
    public static void prac30(){
        
        int i=7;
        int j=15;
        System.out.println(j/i); // 2
        System.out.println(j%i); // 1
        
        
        System.out.println((float)j/i); //2.1428
        System.out.println(15.4/3.2);   //4.8125
        
        System.out.println('C' + 15); // 67+15 = 82
        
        System.out.println(2+3*4); // 14
        System.out.println((2+3)*4); // 20
    }
    
    public static void prac35(){
        
        int x=10;
        System.out.println("\n\nx++ : " + x++); //10
        System.out.println("x : " + x);//11
        System.out.println("++x : " + ++x); //12
        
        float f=10.4f;
        System.out.println("\n\nf++ : " + f++); //10.4
        System.out.println("f : " + f);//11.4
        System.out.println("++f : " + ++f); //12.4
        
        char c ='A';
        System.out.println("\n\nc++ : " + c++); //A
        System.out.println("c : " + c);//B
        System.out.println("++c : " + ++c); //C
        
        
        byte b=1;
        //b = b + 1; //invalid (Casting not done)
        b++; //valid
    }
    
    public static void prac38(){
        int x=-0b1010;
        int y =0b0110,z;
       
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x<<1);
        System.out.println(x>>1);
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(Integer.toBinaryString(x>>>2)+"");
        
        int a = 5,b=9;
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        int c=b<<4|a;
        System.out.println(String.format("%s",Integer.toBinaryString(c)));
        
        //Swapping :
        
        a=a^b;
        b=a^b;
        a=a^b;
        
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
