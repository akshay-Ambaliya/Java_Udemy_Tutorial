/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dateandtimeapi;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class DateAndTimeAPI {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        long seconds = (System.currentTimeMillis()/1000);
        System.out.println(seconds);
        
        int minutes = (int)seconds/60;
        System.out.println(minutes);
        
        int hours = minutes/60;
        System.out.println(hours);
        
        int days = hours/24;
        System.out.println(days);
        
        int weeks = days/7;
        System.out.println(weeks);
        
        int months = days/30;
        System.out.println(months);
        
        int years= days/365;
        System.out.println(years);
        
        Date d = new Date("3/2/2025");
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());
        
    }
    
}
