/*
    Given a String, return the number of Palindromic substring in it.
    Input: "abc"
    Output: 3
 */

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static int countPalindromicSubstrings(String str){
        int count  = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                if (isPalindrome(str.substring(i, j)))
                    count++;
            }
        }
        return count;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        System.out.println("Number of Palindromic Substrings: " +countPalindromicSubstrings(str));
    }
}
