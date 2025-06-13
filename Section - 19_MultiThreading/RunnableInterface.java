/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author Dell
 */
public class RunnableInterface implements Runnable {
    
     public void run(){
        int i =1;
        while(true){
            System.out.print("Hello : ");
            i++;
        }
    }
     
    public static void main(String[] args) {
        Thread thread = new Thread(new MultiThreading());
        thread.start();
        int i=1;
        while(true){
            System.out.print(" : world\n");
            i++;
        }
    }
    
}
