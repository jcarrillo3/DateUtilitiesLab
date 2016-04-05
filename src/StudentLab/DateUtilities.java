/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentLab;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

/**
 * The Date Utilities class is a class created to facilitate the use of 
 * handling Date/DateTime objects with the Java 8 API. We are able to do a 
 * variety of manipulations to these objects, such as formatting them 
 * into strings or vice versa, and we are also able to do some arithmetic 
 * with them, to obtain the information we want.
 * 
 * @author Juan
 */
public class DateUtilities {
    
    /**
     * This method takes in a LocalDate object and formats it into a simple
     * date string that consists of only the month day and year (MM/DD/YYYY),
     * the method then returns the string.
     * @param date
     * @return
     * @throws IllegalArgumentException if LocalDate object is null. 
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
     * This method takes in a LocalDate object and formats it into a specific
     * date string that consists of the weekday, the month, the day of the month
     * and the year.
     * @param date
     * @return
     * @throws IllegalArgumentException if LocalDate object is null.
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
     * This method takes in a string of a date in the format (YYYY-MM-DD)
     * and converts it into a LocalDate object.
     * @param date
     * @return
     * @throws IllegalArgumentException if date is null or empty.
     */
    public LocalDate toDate(String date) throws IllegalArgumentException{
        if (date == null || date.isEmpty()){
            throw new IllegalArgumentException("Date must not be null or empty");
        }
        LocalDate date2 = LocalDate.parse(date);
        
        return date2;
    }
    
    /**
     * This method takes in two LocalDateTime objects and finds the days from 
     * the first LocalDateTime object until the second LocalDateTime object, 
     * and returns the number of days.
     * @param date
     * @param date2
     * @return
     * @throws IllegalArgumentException if either or both of the LocalDateTime
     * objects are null.
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
    
    public LocalDate Date(){
        return LocalDate.now();
    }
}
