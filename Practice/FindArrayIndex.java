package Practice;

import java.util.Scanner;

public class FindArrayIndex {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner in = new Scanner(System.in);
        char[] str = in.nextLine().toCharArray();
        //System.out.println(str);
        System.out.println("Enter a character to find the index: ");
        char[] find = in.next().toCharArray();
        findIndex(str, find);
 }

    public static void findIndex(char[] arr, char[] find) {
        int index = 1;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(find[0] == arr[i]) {
                System.out.printf("The index is: %d\n", index);
                found = true;
            }
            index++;
        }
        if(found == false) {
            System.out.println("The string don't have the character");
        }
    }
}
