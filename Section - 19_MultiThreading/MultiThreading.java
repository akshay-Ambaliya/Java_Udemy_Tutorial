/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author Dell
 */
public class MultiThreading extends Thread{

    public void run(){
        int i =1;
        while(true){
            System.out.print("Hello : ");
            i++;
        }
    }
    public static void main(String[] args) {
        MultiThreading mt = new MultiThreading();
        mt.start();
        int i=1;
        while(true){
            System.out.print(" : world\n");
            i++;
        }
    }
    
}
