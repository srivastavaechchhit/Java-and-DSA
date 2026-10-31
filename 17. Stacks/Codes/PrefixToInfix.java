package Stacks;
import java.util.Stack;

public class PrefixToInfix {
    static void main() {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            if ((int) ch >= 48 && (int) ch <= 57)
                val.push(ch + "");
            else {
                String v1 = val.pop();
                String v2 = val.pop();
                val.push('(' + v1 + ch + v2 + ')');
            }
        }
        System.out.println(val.peek());
    }
}
