package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class InsertionInStack {

    static void insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty())
            temp.push(st.pop());

        st.push(x);

        while (!temp.isEmpty())
            st.push(temp.pop());

        System.out.println(st);
    }

    static void insertAtIdx (Stack<Integer> st, int x, int idx) {
        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx)
            temp.push(st.pop());

        st.push(x);

        while (!temp.isEmpty())
            st.push(temp.pop());

        System.out.println(st);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the element: ");
            st.push(sc.nextInt());
        }

        System.out.print("Enter the element to be inserted: ");
        int x = sc.nextInt();
        System.out.print("Enter the index to be inserted on: ");
        int idx = sc.nextInt();

        insertAtIdx(st, x, idx);
        insertAtBottom(st, x);
    }
}
