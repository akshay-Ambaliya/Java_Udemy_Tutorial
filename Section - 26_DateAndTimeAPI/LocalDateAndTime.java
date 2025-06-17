/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dateandtimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

/**
 *
 * @author Dell
 */
public class LocalDateAndTime {
    public static void main(String[] args) {
        LocalDate d =LocalDate.now();
        System.out.println(d);
        
        d=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d);
        
        d=LocalDate.of(2025, Month.FEBRUARY,25);
        System.out.println(d);
        
        d=LocalDate.ofEpochDay(1000);
        System.out.println(d);
        
        LocalDate temp = d.plusDays(20);
        System.out.println(temp);
        
        
        LocalTime t =LocalTime.now();
        System.out.println(t);
        
        System.out.println(t.getHour());
        System.out.println(t.minusHours(3));
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        
    }
}
