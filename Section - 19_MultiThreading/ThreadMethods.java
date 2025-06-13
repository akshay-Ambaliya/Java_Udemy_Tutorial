/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author Dell
 */
public class ThreadMethods extends Thread {
    
    public ThreadMethods(String s){
        super(s);
    }
    
    public void run(){
        System.out.println("Hello ");
    }
    
    public static void main(String[] args) {
        ThreadMethods t1 = new ThreadMethods("My Thread");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
        System.out.println(t1.isDaemon());
        
        t1.setDaemon(true);
        System.out.println(t1.isDaemon());
        t1.start();
        System.out.println(t1.isAlive());
        
    }
}
