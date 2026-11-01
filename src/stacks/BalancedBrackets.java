package stacks;

import java.util.Stack;
import java.util.Scanner;

public class BalancedBrackets {

    static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(')
                st.push(ch);
            else {
                if (st.isEmpty()) return false;
                if (st.peek() == '(') st.pop();
            }
        }
        return st.isEmpty();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sequence of Brackets: ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
