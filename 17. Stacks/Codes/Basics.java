package Stacks;
import java.util.Stack;

public class Basics {
    static void main() {
        Stack<Integer> st = new Stack<>();

        // Push
        st.push(20);
        st.push(21);
        st.push(2);
        st.push(6);
        st.push(19);

        // Peek
        System.out.println(st.peek());      // 19

        // Printing a Stack
        System.out.println(st);             // [20, 21, 2, 6, 19]

        // Pop
        st.pop();
        System.out.println(st);             // [20, 21, 2, 6]

        st.pop();
        System.out.println(st);             // [20, 21, 2]

        // Size
        System.out.println("Size of stack: " +st.size());       // 3

        // Print nth element from stack
        int n = 1;
        while(st.size() > n) {
            st.pop();
        }
        System.out.println(st);

        // Empty?
        System.out.println(st.isEmpty());       // true
    }
}
