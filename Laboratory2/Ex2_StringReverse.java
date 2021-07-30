package Laboratory2;

import java.util.Scanner;

public class Ex2_StringReverse {
    public static char[] reverse() {
        String nol;
        System.out.println("Enter a string you wish to reverse: ");
        Scanner scanner = new Scanner(System.in);
        nol = scanner.nextLine();
        char[] in = nol.toCharArray();
        int begin = 0;
        int end = in.length-1;
        char temp;
        while(end > begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return in;
    }

    public static void main(String[] args) {
        char[] str;
        str = reverse();
        System.out.println(str);
    }
}
