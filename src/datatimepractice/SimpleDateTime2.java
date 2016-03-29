/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatimepractice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Juan
 */
public class SimpleDateTime2 {
    public static void main(String[] args) throws ParseException {
        //Add Date Formatter
        String format = "M/d/yy h:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        
        //Current date and time
        Calendar date1 = Calendar.getInstance();
        System.out.println("Current: " + df.format(date1.getTime()));
        //Add 30 days
        date1.add(Calendar.DATE, -30);
        System.out.println("30 days prior: " + df.format(date1.getTime()));
        
        //Turn String into Date
        String dateString = "1/1/16 4:15:20 am";
        Date date2 = sdf.parse(dateString);
        sdf.format(date2);
        
        //Lab
        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(5);
        Duration duration = Duration.between(start, end);
        //long difference = ChronoUnit.HOURS.between(start, end);
        System.out.println("Difference in hours between "+ start +" and"+ end+ ": "+duration.toHours());
        
//        LocalDate today = LocalDate.now();
//LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
//
//Period p = Period.between(birthday, today);
//long p2 = ChronoUnit.DAYS.between(birthday, today);
//System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
//                   " months, and " + p.getDays() +
//                   " days old. (" + p2 + " days total)");
        
    }
}
