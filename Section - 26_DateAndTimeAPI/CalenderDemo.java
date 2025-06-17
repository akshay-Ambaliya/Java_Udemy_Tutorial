/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateandtimeapi;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author Dell
 */
public class CalenderDemo {
    public static void main(String[] args) {
        GregorianCalendar gc= new GregorianCalendar(2022,11,5);
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.YEAR));
       gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getID());
        System.out.println(tz.getDisplayName());
        
    }
}
