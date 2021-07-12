package Laboratory3;
/*
Java API has the GregorianCalendar class in the java.util package, which you can use to
obtain the year, month, and day of a date. The no-arg constructor constructs an instance
for the current date, and the methods get(GregorianCalendar.YEAR),
get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return
the year, month, and day.
Write a program to perform two tasks:
• Display the current year, month, and day.
• The GregorianCalendar class has the method setTimeInMillis(long), which can
be used to set a specified elapse time since January 1, 1970. Set the value to
1234567898765L and display the year, month, and day.

 */

import java.util.*;

public class DisplayDate {

    public DisplayDate() {
    }

    public static String cal() {
        GregorianCalendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String calendar = "";
        calendar = calendar + year + " " + month + " " + day + " " ;
        return calendar;
    }

    public static void main(String[] args) {
        //Display current day month year
        String calendar = cal();
        System.out.println("Current date: " + calendar);

        //set a specific elapse time
        GregorianCalendar time = new GregorianCalendar();
        time.setTimeInMillis(1234567898765L);
        System.out.println("Elapse Date: " +
                time.get(GregorianCalendar.YEAR) + " " +
                        time.get(GregorianCalendar.MONTH) + " " +
                        time.get(GregorianCalendar.DAY_OF_MONTH));
    }
}