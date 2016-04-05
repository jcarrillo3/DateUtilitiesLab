/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentLab;

import StudentLab.DateUtilities;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

/**
 *
 * @author Juan
 */
public class Startup {
    public static void main(String[] args) {
        
        //last business day challenge
        LocalDateTime date = LocalDateTime.now().with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println(date.getDayOfMonth());
        
        //difference between 2 dates in minutes
        LocalDateTime date2 = LocalDateTime.now();
        LocalDateTime date3 = date2.plusDays(2).plusHours(1).plusMinutes(5);
        
        //based on current date time, calculate date time in berlin germany
        ZonedDateTime date4 = date2.atZone(ZoneId.of("Europe/Berlin"));
        System.out.println(date4);
        
        // calculate due date 15 days from now
        LocalDate date5 = LocalDate.now();
        LocalDate date6 = date5.plusDays(15);
        System.out.println(date6);
        
        //next leap year
        LocalDate date7 = LocalDate.now();
        boolean leapYear = false;
        while (leapYear != true){
            date7 = date7.plusYears(1);
            if (date7.isLeapYear()){
                System.out.println(date7.getYear());
                leapYear = true;
            }
        }
        
        //Testing DateUtilities
        DateUtilities utilities = new DateUtilities();
        
        LocalDate d1 = LocalDate.now();
        System.out.println(utilities.getSimpleDateFormat(d1));
        System.out.println(utilities.getSpecificDateFormat(d1));
        
        
        LocalDateTime d2 = LocalDateTime.now();
        LocalDateTime d3 = d2.plusWeeks(2).plusDays(3);
        System.out.println(utilities.getDaysUntil(d2, d3));
        System.out.println(utilities.toDate("2016-04-05"));
        System.out.println(utilities.Date());
    }
}
