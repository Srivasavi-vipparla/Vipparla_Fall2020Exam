/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q09_GregorianCalendar;

import java.util.GregorianCalendar;

/**
 *
 * @author Sri Vasavi Vipparla
 */
public class CalendarGregorian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creating objectreference for GregorianCalendar
        GregorianCalendar gc=new GregorianCalendar();
        //displaying the current date by using objectreference
        System.out.println("Current year :"+gc.get(GregorianCalendar.YEAR)+" , month :"+
                gc.get(GregorianCalendar.MONTH)+" , day:"+gc.get(GregorianCalendar.DAY_OF_MONTH) );
        //setting the calendar's current time to 1234567898765L value
        gc.setTimeInMillis(1234567898765L );
        System.out.println("elapsed time since January 1, 1970. Set the value to 1234567898765L");
        //displaying the result after setTimeInMillis(long) value
        System.out.println("Current year :"+gc.get(GregorianCalendar.YEAR)+" , month :"+
                gc.get(GregorianCalendar.MONTH)+" , day:"+gc.get(GregorianCalendar.DAY_OF_MONTH) );
    }
    
}
