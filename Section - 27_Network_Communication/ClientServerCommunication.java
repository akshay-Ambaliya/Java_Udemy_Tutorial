/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkcommunication;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientServerCommunication {
    public static void main(String[] args) throws Exception {
        ServerSocket sSocket = new ServerSocket(2000);
        
        System.out.println("Server Is waiting : ");
        Socket socket = sSocket.accept();
        
        DataInputStream din = new DataInputStream(socket.getInputStream());
        DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
        
        String msg;
        StringBuffer strBuff;
        do{
            msg = din.readUTF();
            strBuff = new StringBuffer(msg);
            msg = strBuff.reverse().toString();
            dout.writeUTF(msg);
        }while(!"dne".equals(strBuff));
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
