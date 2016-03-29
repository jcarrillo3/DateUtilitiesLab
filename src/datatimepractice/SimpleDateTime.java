/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatimepractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Juan
 */
public class SimpleDateTime {
    public static void main(String[] args) {
        //Old Way (Pre JDK8)
        
        // Not international
        Date date1 = new Date();
        System.out.println(date1);
        //Get Date/Time Long Integer Value
        long dateTimeValue = date1.getTime();
        System.out.println("Date Time Value: "+ dateTimeValue);
                
        //International
        Calendar date3 = Calendar.getInstance();
        System.out.println(date3);
        
        //Bad Practice - Don't do this
        date3.set(2020, 2, 22);
        System.out.println("Bad Practice: "+date3);
        //Good Practice
        date3.set(2020, Calendar.MARCH,22);
        System.out.println("Good Practice: "+date3);
        
        
        // New Way (JDK8+)
        //Also International
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);
        
        //Date Only
        LocalDate date4 = LocalDate.now();
        System.out.println(date4);
    }
}
