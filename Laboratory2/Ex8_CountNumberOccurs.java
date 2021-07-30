package Laboratory2;

import java.util.Scanner;

public class Ex8_CountNumberOccurs {
    public static void main(String[] args){
        int[] arr;
        int[] result;
        String input;
        result = new int[100];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer between 1 and 100");
        input = in.nextLine();

        //Spit input into small integer using sub-string
        String[] num = input.split(" ");

        //initialize the array base on the length of the sub-string
        arr = new int[num.length];

        for(int i = 0; i < num.length - 1; i++) {
            arr[i] = Integer.parseInt(num[i]);
            for (int j = 1; j < result.length; j++) {
                if(arr[i] == j) {
                    result[j]++;
                }
            }
        }

        for(int i = 0; i < result.length; i++) {
            if(result[i] > 0){
//                if(result[i] >= 1)
                System.out.printf("%d, %d%n", i, result[i]);
//                else
//                    System.out.printf("%d%n", i);
            }
        }
    }
}
