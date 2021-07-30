package Laboratory2;
/*
A  palindrome  is  a  string that reads  the  same  backward
as  forward  when  ignoring punctuations, blanks and  case  difference.
For  example, "madam", "Hannah", "Step  on no  pets",
"Was  it  a  car  or  a  cat  I  saw?", "A  man,  a  plan,  a  canal,  Panama!"
are  all palindromes. Write  a  method  that  checks  if  a  given  string  is  a
palindrome  or  not. Hint: use the method in the last exercise.
 */
import java.util.Scanner;

public class Ex3_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string");
        String chars = input.nextLine();
        chars = chars.toLowerCase().replaceAll("[^a-z]", "");
        int i;
        int j;
        boolean check = true;
        for (i = 0, j = chars.length() - 1; i < j; ++i, --j) {
            if (chars.charAt(i) != chars.charAt(j)) {
                check = false;
                break;
            }
        }

       // System.out.println(chars);

        if (check) {
            System.out.println("This is a palindrome string");
        } else System.out.println("This is not a palidrome");
    }
}
