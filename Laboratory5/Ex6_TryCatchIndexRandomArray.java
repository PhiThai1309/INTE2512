package Laboratory5;
/* Write a program that:
● Creates an array with 10 randomly chosen integers.
● Prompts the user to enter the index of an element of the array, then displays the
corresponding element value.
● If the specified index is out of bounds, displays the message Array Index Out of
Bounds.
Your program should use try-catch block to handle the exception rather than checking
the array index prior to accessing.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex6_TryCatchIndexRandomArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(1000); //or use Math.random and cast (int)
        }

        try {
            System.out.println("Enter the index number: ");
            Scanner input = new Scanner(System.in);
            int index;
            index = input.nextInt();
            System.out.println(arr[index]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
