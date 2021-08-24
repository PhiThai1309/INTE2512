package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueInt {

    public static void main(String[] args) {
        // Create new hashmap with key is integer, value is counting for it's repeatation
        HashMap<Integer, Integer> numList = new HashMap<>();
        // Asking user for input a list of integers
        String ask = "Please input a list of integers: ";
        // Create new boolean to check if the while loop is complete
        boolean complete = false;
        while (!complete) {
            System.out.print(ask); // print out asking string for user
            Scanner input = new Scanner(System.in); // create new scanner object to scan System.in
            String line = input.nextLine(); // save the input into a string
            Scanner scanner = new Scanner(line); // Scan the string
            while (scanner.hasNextInt()) { // Check if the string has next int
                int num = scanner.nextInt(); // save next int into a int variable
                if (!numList.containsKey(num)) { // Check if the int is exist in the hashmap
                    numList.put(num, 1); // if no => add the int
                } else numList.put(num, numList.get(num) + 1); // if yes increase the value of the int
            }
            if (numList.isEmpty()) { // check if there is any integers in the hashmap
                ask = "Please re-input just some integers: ";
                continue; // if no keep asking the user to input some integers
            } else
                System.out.print("Integers that appear exactly one time: "); // if yes then output the key with the value == 1
            complete = true; // set complete to be true to end the while loop
            numList.forEach((key, value) -> {
                if (value == 1) System.out.print(key + " ");
            });
        }
    }

}

