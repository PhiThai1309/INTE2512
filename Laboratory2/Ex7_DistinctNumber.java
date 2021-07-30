package Laboratory2;

import java.util.Scanner;

public class Ex7_DistinctNumber {
    public static void main(String[] args) {
        int count = 0;
        int num;
        int[] distinct = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer between 1 and 100");
        for(int i = 0; i < 10; i++) {
            num = input.nextInt();

            if(isDistinct(distinct,num)) {
                distinct[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers are: " + count);
        System.out.println("The distinct numbers are: ");
        for(int i = 0; i < distinct.length; i++){
//            if(distinct[i] > 0) {
            System.out.print(" " + distinct[i]);
//            }
        }

        System.out.println();

    }

    public static boolean isDistinct(int[] array, int num) {
        for(int i = 0; i < array.length; i++) {
            if(num == array[i]) {
                return false;
            }
        }
        return true;
    }
}
