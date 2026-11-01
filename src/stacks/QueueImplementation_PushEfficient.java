package stacks;

import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;

public class QueueImplementation_PushEfficient {

    static class MyStack {
        Queue<Integer> q = new ArrayDeque<>();

        void push(int val) {
            q.add(val);
        }

        int pop() {
            for (int i = 1; i < q.size(); i++) q.add(q.poll());
            return q.remove();
        }

        int top() {
            for (int i = 1; i < q.size(); i++) q.add(q.poll());
            int x = q.element();
            q.add(q.poll());
            return x;
        }

        boolean empty() {
            return q.isEmpty();
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack();
        System.out.println(st.empty()); // true

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " +n+ " elements: ");
        for (int i = 1; i <= n; i++) {
            int val = sc.nextInt();
            st.push(val);
        }
        System.out.println(st.empty()); // false
        System.out.println(st.top());   // 19
        System.out.println(st.pop());   // 19
    }
}
