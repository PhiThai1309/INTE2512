package Laboratory2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex4_1_CitiesOrder {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        countries.add(input.nextLine());
        System.out.println("Enter the second city: ");
        countries.add(input.nextLine());
        System.out.println("Enter the third city: ");
        countries.add(input.nextLine());
        Collections.sort(countries);
        System.out.println("The three cities in alphabetical order are: " + countries);
    }
}
