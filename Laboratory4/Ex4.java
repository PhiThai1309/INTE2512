package Laboratory4;

import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

public class Ex4 {
    public static void main(String[] args) {
        int year; // the calendar is displayed for this year
        int month; // and month
        // Create an instance of a standard input stream
        Scanner input = new Scanner(System.in);
        // The user enters year
        System.out.println("Enter full year (i.e. 1999 or 2000)");
        year = input.nextInt();
        // The user enters the month
        System.out.println("Enter month as an integer between 1 and 12");
        month = input.nextInt();
        // Print calendar for the month of the year
        Calendar calendar = new GregorianCalendar();

    }
    // This method prints the calendar for the month of the year.
    public static void printMonth(int year, int month) {
        if(year == 0) {
            year = Calendar.getInstance().get(YEAR);
        }
        if(month == 0) {
            year = Calendar.getInstance().get(MONTH) + 1;
        }
        // Get start day of the week for the first date in the month
        int startDay = getStartDay(year, month);
        // Get number of days in the month
        int numOfDaysInMonth = getNumOfDaysInMonth(year, month);
        // Print headings for the calendar
        printMonthTitle(year, month);
        // Print body of the calendar
        printMonthBody(startDay, numOfDaysInMonth);
    }
    // This method determines the day (Sunday, Monday, etc. on which
    // the first of the month starts.
    public static int getStartDay(int year, int month) {
        int startDay1800 = 3; //January 1, 1800 was on Wednesday
        // Get total number of days since 1/1/1800
        long totalNumOfDays = getTotalNumOfDays(year, month);
        // Return the start day
        return (int)((totalNumOfDays + startDay1800) % 7);
    }
    // This method determines the number of days that have
    // elapsed since 1/1/1800.
    public static long getTotalNumOfDays(int year, int month) {
        long total = 0; //contains the total # of days since 1/1/1800
        //get the total days from 1800 to year -1
        for (int i = 1800; i < year; i++)
            if (leapYear(i))
                total = total + 366;
            else
                total = total + 365;
        // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++)
            total = total + getNumOfDaysInMonth(year, i);
        return total;
    }
    // This method determines the number of days in the selected month.
    // The year is needed to determine the number of days in February.
    public static int getNumOfDaysInMonth(int year, int month) {
        if (month == 1 || month==3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2)
        if (leapYear(year))
            return 29;
        else
            return 28;
        return 0; // if month is incorrect.
    }
    // This method determines whether the selected year is a leap year.
    public static boolean leapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            return true;
        return false;
    }
    // This method prints the body of the calendar for the given month given
    // day of the week on which the month starts and number of days in the month.
    public static void printMonthBody(int startDay, int numOfDaysInMonth) {
        // Print padding space before the first day of the month
        for (int i = 0; i < startDay; i++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= numOfDaysInMonth; i++) {
            if (i < 10)
                System.out.print(" " + i);
            else
                System.out.print(" " + i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }
    // This method prints the title for the calendar for
    // the particular month of the year.
    public static void printMonthTitle(int year, int month) {
        System.out.println(" " + getMonthName(month) + ", " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    // This method is given an integer representation of the month.
    // It determines and returns a string representation of the month.
    public static String getMonthName(int month) {
        String monthName = null; //string to contain the month's name
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        return monthName;
    }
}
