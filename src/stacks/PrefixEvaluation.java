package stacks;

import java.util.Stack;

public class PrefixEvaluation {
    static void main() {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            if ((int) ch >= 48 && (int) ch <= 57)
                val.push((int) ch -48);
            else {
                int v1 = val.pop();
                int v2 = val.pop();
                if (ch == '+') val.push(v1 + v2);
                if (ch == '-') val.push(v1 - v2);
                if (ch == '*') val.push(v1 * v2);
                if (ch == '/') val.push(v1 / v2);
            }
        }
        System.out.println("Ans: " +val.peek());
    }
}
