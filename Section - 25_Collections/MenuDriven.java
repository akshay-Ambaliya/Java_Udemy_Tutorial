/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Dell
 */

class Account implements Serializable{

    static int counter=1;
    public String name;
    public String accNo;
    public int accId;
    public int amount;
    
    public Account(String name, int amount) {
        this.name = name;
        this.accId = counter++;
        this.accNo = "BOI"+accId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return  "name=" + name + ", accNo=" + accNo + ", accId=" + accId + ", amount=" + amount;
    }
    
    
    
}

public class MenuDriven {
    public static void main(String[] args) throws Exception{
        
        HashMap<Integer,Account> map = new HashMap<>();
        int i=0;
        while(i!=6){
            System.out.println("1. Create Account : ");
            System.out.println("2. Delete Account : ");
            System.out.println("3. View Account : ");
            System.out.println("4. ViewAll Account : ");
            System.out.println("5. SaveAccount : ");
            System.out.println("6. Exit : ");
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter you choice :");
            i=scanner.nextInt();
            switch(i){
                case 1: 
                    System.out.println("Please Enter Your name : ");
                    String name = scanner.next();
                    System.out.println("Amount : ");
                    int amount = scanner.nextInt();
                    map.put(Account.counter, new Account(name,amount));
                break;
                
                case 2:
                    System.out.println("Please Enter Your Account ID : ");
                    int accId = scanner.nextInt();
                    map.remove(accId);
                break;
                
                case 3:
                    System.out.println("Please Enter Your name : ");
                    name = scanner.next();
                    
                    map.forEach((k,v)->{
                        if(v.name.equals(name)){
                            System.out.println(v);
                        }
                    });
                break;
                
                case 4:
                    System.out.println("Please Enter Your name : ");
                    name = scanner.next();
                    
                    map.forEach((k,v)->{
                            System.out.println(v);
                    });
                break;
                case 5:
                    FileOutputStream fout = new FileOutputStream("D:\\java\\Collection\\src\\collection\\Account.txt");
                    ObjectOutputStream oout = new ObjectOutputStream(fout);
                    oout.writeObject(map);
                    System.out.println("Data Saved");
                break;
            }
        }
    }
}
