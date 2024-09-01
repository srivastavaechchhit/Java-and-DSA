import java.util.Scanner;

class RemoveOccurrence {

    static String removeA(String str, int idx) {
        if (idx == str.length())
            return "";
        char currChar = str.charAt(idx);
        if (currChar != 'a')
            return currChar + removeA(str, idx + 1);
        return removeA(str, idx + 1);
    }

    static String removeA2(String str) {
        if (str.isEmpty())
            return "";
        char currChar = str.charAt(0);
        if (currChar != 'a')
            return currChar + removeA2(str.substring(1));
        return removeA2(str.substring(1));
    }
}

class Palindrome {

    static String reverse(String str) {
        if (str.isEmpty()) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }

    static boolean isPalindrome(String str) {
        return (str.equals(reverse(str)));
    }

    static boolean isPalindrome2(String str, int left, int right) {
        if (left >= right) return true;
        return ((str.charAt(left) == str.charAt(right)) && isPalindrome2(str, left + 1, right - 1));
    }
}

public class StringRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Original: " +str);

        System.out.println("After removing 'a': " +RemoveOccurrence.removeA(str, 0));
        System.out.println("After removing 'a': " +RemoveOccurrence.removeA2(str));

        if (Palindrome.isPalindrome(str))
            System.out.printf("%s is Palindrome", str);
        else
            System.out.printf("%s is not Palindrome", str);

        if (Palindrome.isPalindrome2(str, 0, str.length()-1))
            System.out.printf("%s is Palindrome", str);
        else
            System.out.printf("%s is not Palindrome", str);
    }
}
