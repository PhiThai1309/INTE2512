package Practice;

import java.util.Locale;
import java.util.Scanner;

public class CipherText {
    public static void main(String[] args) {
        char[] plaintext = "abcdefghijklmnopqrstuvwxyz" .toCharArray();
        char[] ciphertext = "qtgabcdefhijklmnoprsuvwxyz" .toCharArray();
        System.out.println("Enter a string to cipher: ");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine().toLowerCase();
        char[] text = in.toCharArray();
        for(int i = 0; i < text.length; i++) {
            for(int j = 0; j < 26; j++) {
                if(text[i] == plaintext[j]) {
                    text[i] = ciphertext[j];
                } else continue;
            }
        }
        System.out.println(text);
    }
}
