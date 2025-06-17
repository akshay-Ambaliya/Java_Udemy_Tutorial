/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateandtimeapi;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;


/**
 *
 * @author Dell
 */
public class DateFormatter {
    public static void main(String[] args) {
        /*
            y=year
            M=month
            d=day
        
            h=Hour(0-12)
            H=hour(0-23)
            m=minute
            s=seconds
            S=miliseconds
            z=timezone
            Z=offset
        
        */
        
        ZonedDateTime date = ZonedDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd z Z");
        System.out.println(formatter.format(date));
        System.out.println(date.get(ChronoField.DAY_OF_YEAR));
    }
}
