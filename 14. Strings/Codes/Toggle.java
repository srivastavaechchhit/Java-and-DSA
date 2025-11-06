/*
    Given a String, the task is to toggle all the characters of the String
    i.e. to convert the UpperCase to LowerCase and vice versa.
 */

import java.util.Scanner;

public class Toggle {

    static void toggleCase(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 65 && ascii <=90) {
                ascii += 32;
                char tch = (char)ascii;
                str.setCharAt(i, tch);
            } else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
                char tch = (char)ascii;
                str.setCharAt(i, tch);
            } else continue;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        System.out.println("Given String: " +str);
        toggleCase(str);
        System.out.println("Changed String: " +str);
    }
}
