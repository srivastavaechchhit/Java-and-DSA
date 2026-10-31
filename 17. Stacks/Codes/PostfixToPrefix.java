package Stacks;
import java.util.Stack;

public class PostfixToPrefix {
    static void main() {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((int) ch >= 48 && (int) ch <= 57)
                val.push(ch + "");
            else {
                String v2 = val.pop();
                String v1 = val.pop();
                val.push(ch + v1 + v2);
            }
        }
        System.out.println(val.peek());
    }
}
