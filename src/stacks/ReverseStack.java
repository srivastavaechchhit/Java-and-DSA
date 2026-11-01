package stacks;

import java.util.Stack;
import java.util.Scanner;

public class ReverseStack {

    static void reverseUsingRecursion(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+ " ");
        reverseUsingRecursion(st);
        st.push(top);
    }

    static void reverseUsingRecursion2 (Stack<Integer> st) {
        if (st.size() == 1) return;
        int top = st.pop();
        reverseUsingRecursion2(st);
        pushAtBottom(st, top);
    }

    static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    static void reverseInSameStack(Stack<Integer> st) {
        // Reverse Order
        Stack<Integer> st1 = new Stack<>();
        while (!st.isEmpty())
            st1.push(st.pop());

        // Reverse Again
        Stack<Integer> st2 = new Stack<>();
        while (!st1.isEmpty())
            st2.push(st1.pop());

        // Fill Original Stack
        while(!st2.isEmpty())
            st.push(st2.pop());
    }

    static Stack<Integer> reverse(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty())
            temp.push(st.pop());
        return temp;
    }

    static void print(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty())
            temp.push(st.pop());
        while (!temp.isEmpty()) {
            int top = temp.pop();
            System.out.print(top+ " ");
            st.push(top);
        }
        System.out.println();
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the element: ");
            st.push(sc.nextInt());
        }
        System.out.println("Original Stack: ");
        print(st);
        System.out.println("Reversed Stack: ");
        reverseUsingRecursion2(st);
        print(st);
    }
}
