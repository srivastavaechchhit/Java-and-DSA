/*
    Given a String, reverse each word present.

    Input: I am a Student.
    Output: I ma a tnedutS.
 */

import java.util.Scanner;

public class Reverse {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ')
                sb.append(ch);
            else {
                sb.reverse();
                ans.append(sb);
                ans.append(" ");
                sb = new StringBuilder();
            }
        }
        sb.reverse();
        ans.append(sb);
        System.out.println(ans);
    }
}
