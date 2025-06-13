

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;
//
//
//
//
public class Synchronization extends Thread {
    static int counter = 0;
    public void run(){
        for(int i = 1 ;i<=50;i++){
            synchronized(Synchronization.class){

                counter++;
            }
        }
    }
    
    public static void main(String[] args) {
        Synchronization sync1 = new Synchronization();
        Synchronization sync2 = new Synchronization();
        
        sync1.setName("Kalu");
        sync1.start();
        
        sync2.setName("Dholu");
        sync2.start();
        
        try {
            sync1.join();
            sync2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Synchronization.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Final counter value: " + Synchronization.counter);
    }
}




//class Resource {
//
//    static int counter = 1;
//
//    public void display() {
//        System.out.println("Accessing Resource " + counter);
//        counter++;
//    }
//}
//
//public class Synchronization extends Thread {
//
//    Resource r = new Resource();
//
//    public void run() {
//        for (int i = 1; i <= 40000; i++) {
//            r.display();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Synchronization sync1 = new Synchronization();
//        Synchronization sync2 = new Synchronization();
//
//        sync1.setName("Kalu");
//        sync1.start();
//
//        sync2.setName("Dholu");
//        sync2.start();
//        
//                try {
//            sync1.join();
//            sync2.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Synchronization.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        System.out.println("Final counter value: " + Resource.counter);
//
//    }
//}
