/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hoursworked;
import java.time.LocalTime;
import java.time.Duration;
/**
 *
 * @author vrnn
 */
public class Hoursworked {

    public static void main(String[] args) {
      //Define work start and end times
        LocalTime start = LocalTime.of(8, 30); //8:30 am
        LocalTime end = LocalTime.of(17, 30); //5:30 pm
      
      //Calculate the duration in hrs and minutes
        Duration duration = Duration.between(start, end);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
       
      //Calculate total works hours in 6 days
        long totalMinutesInWeek = minutes * 6; // Monday to Saturday
        long totalHoursInWeek = hours * 6; // Monday to Saturday
        
       System.out.println("Total hours worked: " + hours + " hours " + minutes + " minutes ");
       System.out.println("Total hours worked from Monday to Saturday: " + totalHoursInWeek + " totalHoursInWeek ");
    
        
        
        
        
        
        
    }
}
