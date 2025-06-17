/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkcommunication;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MultithreadedNetworkCommunication extends Thread{
    
    public Socket client;
    
    public MultithreadedNetworkCommunication(Socket client){
        this.client = client;
    }
            
    public void run(){
        try{
            DataInputStream din = new DataInputStream(client.getInputStream());
            DataOutputStream dout = new DataOutputStream(client.getOutputStream());

            String msg;
            StringBuffer strBuff;
            do{
                msg = din.readUTF();
                strBuff = new StringBuffer(msg);
                msg = strBuff.reverse().toString();
                dout.writeUTF(msg);
            }while(true);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }         
        
    }
    
    public static void main(String[] args) throws Exception {
        ServerSocket sSocket = new ServerSocket(2000);
        int counter=0;
        do {           
            Socket socket = sSocket.accept();
            MultithreadedNetworkCommunication mnc = new MultithreadedNetworkCommunication(socket);
            System.out.println(++counter + "Client Connected ");
            mnc.start();
        } while (true);
    }        
}

class Client{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("Localhost",2000);
        Scanner scanner= new Scanner(System.in);
        
        DataInputStream din = new DataInputStream(socket.getInputStream());
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        
        String msg;
        do{
            msg = scanner.next();
            dout.writeUTF(msg);
            msg=din.readUTF(); 
            System.out.println(msg);
        }while(!"dne".equals(msg));
        
        System.out.println("Exited");
    }
}
