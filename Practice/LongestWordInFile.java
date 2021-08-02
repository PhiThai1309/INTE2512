package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordInFile {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(longestWord());
    }

    public static String longestWord() throws FileNotFoundException {
        String longestWord = "";
        String word = "";
        File file = new File("Practice/text.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            word = scanner.next();
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
