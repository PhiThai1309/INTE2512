package Practice;

import java.io.*;
import java.util.Scanner;

public class CipherTextToFile {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            //open a file
            File file = new File("Practice/text.txt");
            Scanner in = new Scanner(file);
            String str = "";
            char[] line;
            //write file content into a string
            while(in.hasNextLine()) {
                str += in.nextLine().toLowerCase();
                str += "\n";
            }
            line = str.toCharArray();
//            System.out.println(line);
//            //create a file
//            File file2 = new File("Practice/cipher.txt");
//            if (file2.createNewFile()) {
//                System.out.println("File created: " + file2.getName());
//            } else {
//                System.out.println("File already exists.");
//            }

            //write to a file
            FileWriter myWriter = new FileWriter("Practice/cipher.txt");
            ciphertext(file, line);
            PrintWriter output = new PrintWriter(myWriter);
            output.println(line);
            if(!output.checkError()) {
                System.out.println("Write to file successfully!");
            }
            output.flush();
            output.close();
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ciphertext(File file, char[] str) throws FileNotFoundException {
        char[] plaintext = "abcdefghijklmnopqrstuvwxyz" .toCharArray();
        char[] ciphertext = "qtgabcdefhijklmnoprsuvwxyz" .toCharArray();
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < 26; j++) {
                if(str[i] == plaintext[j]) {
                    str[i] = ciphertext[j];
                } else continue;
            }
        }
    }

}
