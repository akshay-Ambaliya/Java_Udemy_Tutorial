/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class Television{
    private String channel; //Stored in heap
    private int volume; // stored in heap
    
    //Stored in method area
    public void changeChannel(String channelName){
        channel=channelName;
        System.out.println("TV channel changed to " + channelName);
    }
    
    public void changeVolume(int volume){
        this.volume = volume;
        System.out.println("TV Volume : " + volume);
    }
    
}

public class TestTelevision{
    public static void main(String[] args) {
        
        //"tv stored in stack"
        Television tv = new Television();
        tv.changeChannel("SUB TV");
        tv.changeVolume(25);
    }
}