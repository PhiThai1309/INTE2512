package Laboratory2;

import java.util.Scanner;

public class Ex4_2_DetermineSortedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for(int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        boolean check = true;
        int j = 1;
        for(int i = 2; i < size; i++) {
            if(list[i] < list[j]) {
                check = false;
                break;
            }
            ++j;
        }

        if(check) {
            System.out.println("The list is already sorted");
        } else System.out.println("The list is not sorted");
    }
}
