/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

class Super{
    public void show(){
        System.out.println("Show method Of Super Class get Executed : ");
    }
}

class Sub extends Super{
    public void show(){
        System.out.println("Show method Of Sub Class get Executed : ");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        Super sup = new Super();
        sup.show();
        
        Super sub1 = new Sub();
        sub1.show();
        
        Sub sub2 = new Sub();
        sub2.show();
        
        //Sub sup2 = new Super();        this is Illegal 
        //sub2.show();
    }
}
