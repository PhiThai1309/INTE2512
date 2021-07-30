package Laboratory2;

import java.util.Scanner;

public class Ex1_LeapYear {
    public static void main(String[] args){
        input y = new input();
        y.getYear();
        y.getMonth();

//        switchCase s = new switchCase();
        switchCase.switchCase(input.month);

        if(input.month.equals("Feb")) {
//            leapYear ly = new leapYear();
            leapYear.leapyear(input.year);
            System.out.println(input.month + " " + input.year + " has " + leapYear.lyear + " days\n");
        }else System.out.println(input.month + " " + input.year + " has " + switchCase.days + " days\n");
    }
}

class input {
    public static int year = 0;
    public static String month;

    public void getYear() {
        System.out.println("Input years: ");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();
    }

    public void getMonth() {
        System.out.println("Input Month with 3 characters: ");
        Scanner input = new Scanner(System.in);
        month = input.nextLine();

    }
}
class switchCase {
    public static int days;

    public switchCase() {
    }

    public static void switchCase(String m) {
        switch (m) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days = 31;
                break;
//            case "Feb":
//                leapYear.leapyear(days);
//                days = leapYear.lyear;
//                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;
            default:
                days = 0;

        }
    }
}
class leapYear {
    public static int lyear = 0;

    public static void leapyear(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    lyear = 29;
                } else lyear = 28;
            } else lyear = 29;
        }else lyear = 28;
    }
}


