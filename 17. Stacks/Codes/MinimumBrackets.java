package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class MinimumBrackets {

    static int countBrackets(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int brackets = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch);
            else {
                if (st.isEmpty()) brackets++;
                else st.pop();
            }
        }
        return st.size() + brackets;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sequence of Brackets: ");
        String str = sc.nextLine();
        System.out.println("Minimum number of brackets to be removed: " +countBrackets(str));
    }
}
