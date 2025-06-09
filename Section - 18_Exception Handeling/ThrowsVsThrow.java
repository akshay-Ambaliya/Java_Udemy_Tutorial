/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExceptionHandeling;

class LowBalanceException extends Exception{
    
    public String toString(){
        return "Balance must be more than 5000";
    }
    
}

public class ThrowsVsThrow {
    static void fun1()throws LowBalanceException{
        throw new LowBalanceException();
    }
    
    static void fun2() throws LowBalanceException{
            fun1();      
    }
    
    static void fun3() throws LowBalanceException{
        fun2();
        System.out.println("Hii");
    }
    
    public static void main(String args[]){
        try{
            fun3();   
        }
        catch(LowBalanceException e){
            System.out.println(e);
        }
    }
}
