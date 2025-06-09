/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandeling;

import java.util.Scanner;

class StackOverflow extends Exception{
    public String toString(){
        return "Stack reaches it's upper limit  :";
    }
}

class StackUnderflow extends Exception{
    public String toString(){
        return "Stack reaches it's lower limit  :";
    }
}

class Stack{
    
    int []arr = new int[5];
    int top = -1;
    
    public void push(int element){
        
        try{
            if(top+1 == 5)
                throw new StackOverflow();
            arr[++top] = element;
        }
        catch(StackOverflow e){
            System.out.println(e);
        }

        
    }
    
    public void pop(){
        
        try{
            if(top == -1)
                throw new StackUnderflow();
            --top;
        }
        catch(StackUnderflow e){
            System.out.println(e);
        }
    }
    
    public void displayStack(){
        System.out.println("\n Stack : ");
        
        for(int i=0;i<=top;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
public class StackExecution {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.println("1. push : ");
        System.out.println("2. Pop : ");
        int choice = 0,element;       
        while(choice != 3){
            
            System.out.println("\n\nPlease Enter push or pop : ");
            choice = scanner.nextInt();
            
            switch(choice){
                
                case 1:
                    System.out.println("Please Enter Element to push : ");
                    element = scanner.nextInt();
                    stack.push(element);
                    stack.displayStack();
                break;
                case 2:
                    stack.pop();
                     stack.displayStack();
                break;
                default :
                    System.out.println("End OF program");
                break;     
            }
        }
    }
}
