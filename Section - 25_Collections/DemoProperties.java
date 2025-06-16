/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 *
 * @author Dell
 */
public class DemoProperties {
    public static void main(String[] args) throws Exception{
        Properties car = new Properties();
        car.setProperty("Company", "Tata");
        car.setProperty("Model", "Nano");
        car.setProperty("Color", "Red");
        
        System.out.println(car);
        car.store(new FileOutputStream("D:\\java\\Collection\\src\\collection\\Test.txt"), "Car Details : ");
        car.storeToXML(new FileOutputStream("D:\\java\\Collection\\src\\collection\\Data.xml"), "Car Details : ");
        
        car.load(new FileInputStream("D:\\java\\Collection\\src\\collection\\Test.txt"));
        System.out.println(car);
        
        
        car.loadFromXML(new FileInputStream("D:\\java\\Collection\\src\\collection\\Data.xml"));
        System.out.println(car);
    }
}
