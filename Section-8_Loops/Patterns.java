/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Patterns {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Size of Pattern : ");
        int size = scanner.nextInt();
        System.out.println("");
        
//        Patterns.Patter1(size);
//        Patterns.Patter2(size);
//        Patterns.Patter3(size);
//        Patterns.Pattern4(size);
//        Patterns.Pattern5(size);
//        Patterns.Pattern6(size);
//        Patterns.Pattern7(size);
//        Patterns.Pattern8(size);
        Patterns.Pattern9(size);

    }
    
    public static void Pattern1(int size){
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                System.out.print(j+"  ");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern2(int size){
        //1 1 1 1 1
        //2 2 2 2 2
        //3 3 3 3 3
        //4 4 4 4 4
        //5 5 5 5 5
        
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                System.out.print(i+"  ");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern3(int size){
        //2 3 4 5 6
        //3 4 5 6 7
        //4 5 6 7 8
        //5 6 7 8 9
        //6 7 8 9 10
        
        for(int i=1;i<=size;i++){
            for(int j=i+1;j<=size+i;j++){
                System.out.print(j+"  ");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern4(int size){
        
//        1 2 3 4 5 
//        6 7 8 9 10
//        11 12 13 14 15 
//        16 17 18 19 20
//        21 22 23 24 25
        
        int k=1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++,k++){
                System.out.print(k+"\t");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern5(int size){
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
        
        
        int k=1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++,k++){
                System.out.print(k+"\t");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern6(int size){
        
    //    1
    //    1 2
    //    1 2 3
    //    1 2 3 4
    //    1 2 3 4 5
        
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern7(int size){
        
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
        
        for(int i=size;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"  ");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern8(int size){
        
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *
        
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                
                if(j<i)
                    System.out.print(" "+"  ");
                else
                    System.out.print("*"+"  ");
            }
            System.out.print("\n");
        }
    }
    
    public static void Pattern9(int size){
        
//                    *
//                 *  *                  
//              *  *  *
//           *  *  *  *
//        *  *  *  *  *
                
        
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                
                if(j<=size-i)
                    System.out.print(" "+"  ");
                else
                    System.out.print("*"+"  ");
            }
            System.out.print("\n");
        }
    }
}
