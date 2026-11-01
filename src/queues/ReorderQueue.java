package queues;

import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayDeque;

public class ReorderQueue {

    static void interleave(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        int n = q.size() / 2;

        for (int i = 1; i <= n; i++)
            st.push(q.poll());

        while (!st.isEmpty())
            q.add(st.pop());

        for (int i = 1; i <= n; i++)
            st.push(q.poll());

        for (int i = 1; i <= n; i++) {
            q.add(st.pop());
            q.add(q.poll());
        }

        while (!q.isEmpty())
            st.add(q.poll());

        while (!st.isEmpty())
            q.add(st.pop());
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.print("Enter " +n+ " elements: ");
        for (int i = 1; i <= n; i++)
            q.add(sc.nextInt());

        System.out.println("Original Queue: " +q);
        interleave(q);
        System.out.println("Reordered Queue: " +q);
    }
}
