package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class other {
        public static void main(String[] args){
            boolean check = false;
            do {
                int[] arr = new int[100];
                Scanner sc = new Scanner(System.in); //Initialize Scanner

                //Take user input using Scanner
                System.out.print("Input: ");
                String input = sc.nextLine();

                try {
                    String[] str = input.trim().split("\\s+"); //Split user input to multiple integer

                    //Convert from the array into integer
                    for(int i = 0; i < str.length; i++){
                        arr[i] = Integer.parseInt(str[i]);
                    }
                    //Print the result using the function below
                    integeroccuronce(arr,arr.length);
                    check = false;
                } catch (NumberFormatException e) {
                    //Exception handle
                    System.out.println("The input is not valid! Please enter again");
                    check = true;
                }
            } while(check);
        }
        public static void integeroccuronce(int[] str, int size){
            System.out.print("Output: ");

            //Check for input if there is 1 input
            if(size == 1) {
                System.out.println(str[0]);
            }
            //Sort user array
            Arrays.sort(str);
            //Check for the first number
            if(str[0] != str[1]){
                System.out.print(str[0] + " ");
            }
            //Check next until the last element
            for (int j = 1; j < size - 1; j++) {
                if (str[j] != str[j + 1] && str[j] != str[j - 1]) {
                    System.out.print(str[j] + " ");
                }
            }
            // Check array last position
            if (str[size - 2] != str[size - 1]) {
                System.out.print(str[size - 1] + " ");
            }
        }

}
