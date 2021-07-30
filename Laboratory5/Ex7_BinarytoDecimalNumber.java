package Laboratory5;

import java.util.Scanner;

/*
Write the bin2Dec(String binaryString) method to convert a binary string into a decimal
number. The method throws a NumberFormatException (a subclass of
RuntimeException) if the string is not a binary string. Write a program to test this
method. Write a test program to test this method with a number of different arguments.
*/
public class Ex7_BinarytoDecimalNumber {
    public static void main(String[] args) {
        System.out.println("Enter a binary string: ");
        Scanner in = new Scanner(System.in);
        String binaryString = in.next();
        try {
            int decimal = Integer.parseInt(binaryString,2);
            System.out.println(decimal);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());;
        }
    }
}
