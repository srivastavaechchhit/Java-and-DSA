package stacks;

import java.util.Stack;

public class CopyStack {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(20);
        st.push(21);
        st.push(2);
        st.push(6);
        st.push(19);

        // Reverse Order
        Stack<Integer> st1 = new Stack<>();
        while (!st.isEmpty())
            st1.push(st.pop());
        System.out.println(st1);

        // Reverse Again
        Stack<Integer> st2 = new Stack<>();
        while (!st1.isEmpty())
            st2.push(st1.pop());
        System.out.println(st2);

    }
}
