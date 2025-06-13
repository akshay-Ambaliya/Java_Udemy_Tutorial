
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class Resource{

    public int value;
    public boolean flag = false;
    
    synchronized public int get(){
        
        while(!flag){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        
        flag =false;
        notify();
        return value;
    }
    
    synchronized public void set(int i){
        while(flag){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }

        value = i;
        flag=true;
        notify();
    }
};

class Consumer extends Thread{
    
    Resource r;
    
    Consumer(Resource data){
        r=data;
    }
    
    public void run(){
        
        for(int i=0;i<50;i++){
            try { Thread.sleep(10); } catch (Exception e) {}
            System.out.println("Consumer : "+ r.get());
        }
    }
}

class Producer extends Thread{
    Resource r;
    
    Producer(Resource data){
        r=data;
    }
    
    public void run(){
        
        int i=1;
        for(int j=0;j<50;j++){
            try { Thread.sleep(10); } catch (Exception e) {}
            r.set(i);
            System.out.println("Producer : "+ i++);
        }
    }
}


public class RaceCondition{
    public static void main(String[] args) {
        Resource r=new Resource();
        Producer p =new Producer(r);
        Consumer c = new Consumer(r);
        
        p.start();
        c.start();
    }
}



//class Resource{
//    int buffer = 0;
//    boolean isProduced = false;
//    
//    public synchronized void Consumer(){
//        while(!isProduced){
//            try {
//                wait();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//        
//        System.out.println("Consumer : " + buffer);
//        isProduced = false;
//        notify();
//    }
//    
//    public synchronized void Producer(){
//        while(isProduced){
//            try {
//                wait();
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        
//                    
//        buffer++;
//        System.out.println("Producer : " + buffer);
//        isProduced = true;
//        notify();
//    }
//}
//
//public class RaceCondition{
//    public static void main(String[] args) {
//        Resource res = new Resource();
//        Thread produce = new Thread(()->{
//            for(int i=0;i<50;i++){
//                res.Producer();
//            }
//        });
//        
//        Thread consume = new Thread(()->{
//            for(int i=0;i<50;i++){
//                res.Consumer();
//            }
//        });
//        
//        produce.start();
//        consume.start();
//    }
//}
//
