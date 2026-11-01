package queues;

import java.util.Stack;
import java.util.Scanner;

public class StackImplementation_PushEfficient {

    static class MyQueue {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        void push(int val) {
            st.push(val);
        }

        int pop() {
            while (st.size() > 1) helper.push(st.pop());
            int x = st.pop();
            while (!helper.isEmpty()) st.push(helper.pop());
            return x;
        }

        int peek() {
            while (st.size() > 1) helper.push(st.pop());
            int x = st.peek();
            while (!helper.isEmpty()) st.push(helper.pop());
            return x;
        }

        boolean empty() {
            return st.isEmpty();
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue();
        System.out.println(q.empty());      // true

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " +n+ " elements: ");
        for (int i = 1; i <= n; i++) {
            int val = sc.nextInt();
            q.push(val);
        }
        System.out.println(q.empty());      // false
        System.out.println(q.peek());       // 20
        System.out.println(q.pop());        // 20
    }
}
