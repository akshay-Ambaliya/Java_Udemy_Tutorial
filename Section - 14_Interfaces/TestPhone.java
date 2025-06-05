/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

class Phone 
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera
{
    void click();
    void record();
}

interface IMusicPlayer
{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer
{
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    @Override
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    
    @Override
    public void record() { System.out.println("Smart Phone recording video"); }
    
    @Override
    public void play() { System.out.println("Smart Phone playing music"); }
    
    @Override
    public void stop() { System.out.println("Smart Phone stopped playing music"); }

}

public class TestPhone {
    public static void main(String[] args) {
        IMusicPlayer sp = new SmartPhone();
        sp.play();
        sp.stop();
    }
}
