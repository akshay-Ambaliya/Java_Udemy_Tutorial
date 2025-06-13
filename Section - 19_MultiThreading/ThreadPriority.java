/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */


public class ThreadPriority extends Thread{
    
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("Hello "+this.getPriority());
            try {
                sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadPriority.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(getPriority() + " Completed His Job");
    }
    
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        
        t1.start();
        t2.start();
        t3.start();
      
    }
}
