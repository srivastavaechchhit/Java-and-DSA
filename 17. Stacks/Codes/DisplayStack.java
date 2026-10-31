package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class DisplayStack {

    static void printUsingRecursion(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        printUsingRecursion(st);
        System.out.print(top+ " ");
        st.push(top);
    }

    static void printUsingArray(Stack<Integer> st) {
        int n = st.size();
        int[] arr = new int[n];
        for (int i = n-1; i >= 0; i--)
            arr[i] = st.pop();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
            st.push(arr[i]);
        }
    }

    static void printStack(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty())
            temp.push(st.pop());
        while (!temp.isEmpty()) {
            int x = temp.pop();
            System.out.print(x+ " ");
            st.push(x);
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the element: ");
            st.push(sc.nextInt());
        }
        printStack(st);
        printUsingArray(st);
        printUsingRecursion(st);
    }
}
