/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialization;

import java.io.*;

/**
 *
 * @author Dell
 */
public class Customer implements Serializable {
    public static int counter = 0;
    public String name;
    public int custId;
    public long contact;
    public int purchase;

    public Customer(String name, long contact, int purchase) {
        this.name = name;
        this.custId = ++counter;
        this.contact = contact;
        this.purchase = purchase;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return  "name=" + name + "\n custId=" + custId + "\n contact=" + contact +"\n purchase=" + purchase;
    }
//    
//    public static void main(String[] args) throws Exception {
//        FileOutputStream fout = new FileOutputStream("D:\\java\\IOStream\\src\\Serialization\\Test.txt");
//        ObjectOutputStream oout = new ObjectOutputStream(fout);
//        
//        Customer c = new Customer("Manoj",7485932615L,1500);
//        
//        oout.writeObject(c);
//        
//        oout.close();
//        fout.close();
//    }
    
    
    public static void main(String[] args) throws Exception {
        FileInputStream fIn = new FileInputStream("D:\\java\\IOStream\\src\\Serialization\\Test.txt");
        ObjectInputStream oIn = new ObjectInputStream(fIn);
        
        Customer c = new Customer();
        
        c = (Customer)oIn.readObject();
        
        System.out.println(c);
        
        oIn.close();
        fIn.close();
    }
}
