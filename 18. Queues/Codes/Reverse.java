package Queues;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayDeque;

public class Reverse {

    static void reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()) st.push(q.poll());
        while (!st.isEmpty()) q.add(st.pop());
    }

    static void reverseK_Elements(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for (int i = 1; i <= k; i++) st.push(q.poll());
        while (!st.isEmpty()) q.add(st.pop());
        for (int i = 1; i <= n-k; i++) q.add(q.poll());
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements: ");

        for (int i = 1; i <= n; i++) q.add(sc.nextInt());
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original Queue: " +q);
        reverseK_Elements(q, k%q.size());
        System.out.println("Reversed Queue: " +q);
    }
}
