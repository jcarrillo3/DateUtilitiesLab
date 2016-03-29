/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentLab;

import java.text.SimpleDateFormat;
import java.time.*;

/**
 *
 * @author Juan
 */
public class DateUtilities {
    
    /**
     * 
     * @param date
     * @return
     * @throws IllegalArgumentException 
     */
    public String getSimpleDateFormat(LocalDate date)throws IllegalArgumentException{
        if (date == null){
            throw new IllegalArgumentException("Date must not be null");
        } 
        else {
        String formatDate = date.getMonthValue() + "/" +
                date.getDayOfMonth() + "/" + date.getYear();
        return formatDate;
        }
    }
    
    /**
     * 
     * @param date
     * @return
     * @throws IllegalArgumentException 
     */
    public String getSpecificDateFormat(LocalDate date)throws IllegalArgumentException{
        if (date == null){
            throw new IllegalArgumentException("Date must not be null");
        } 
        else {
            String formatDate = date.getDayOfWeek() + " " + date.getMonth() 
                    + " " + date.getDayOfMonth() + ", " + date.getYear();
            return formatDate;
        }
    }
    
    /**
     * 
     * @param date
     * @param date2
     * @return
     * @throws IllegalArgumentException 
     */
    public long getDaysUntil(LocalDateTime date, LocalDateTime date2)throws IllegalArgumentException{
        if (date == null){
            throw new IllegalArgumentException("Date must not be null");
        } 
        else {
            Duration duration = Duration.between(date, date2);
            long days = duration.toDays();
            return days;
        }
    }
}
