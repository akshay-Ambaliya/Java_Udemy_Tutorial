/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkcommunication;

import java.net.*;

/**
 *
 * @author Dell
 */
public class DatagramCommunication {
    public static void main(String[] args) throws Exception{
        DatagramSocket ds = new DatagramSocket(2001);
        String string = "My Name is Akshay";
        DatagramPacket dp = new DatagramPacket(string.getBytes(),string.length(),InetAddress.getByName("Localhost"),2000);
        ds.send(dp);
        
        byte[] b = new byte[1000];
        dp= new DatagramPacket(b,1000);
        ds.receive(dp);
        
        string = new String(dp.getData(),0,dp.getLength()).toString().trim();
        
        System.out.println(string);
        ds.close();
    }
}

class Server{
    public static void main(String[] args) throws Exception  {
        DatagramSocket ds = new DatagramSocket(2000);
        
        byte[] b = new byte[1000];
        DatagramPacket dp= new DatagramPacket(b,1000);
        ds.receive(dp);
        
        String str = new String(dp.getData(),0,dp.getLength()).trim();
        StringBuffer strBuff = new StringBuffer(str);
        strBuff.reverse();
        String msg = strBuff.toString();
        dp = new DatagramPacket(msg.getBytes(),msg.length(),InetAddress.getByName("Localhost"),2001);
    
        ds.send(dp);
        
        ds.close();
    }
}
