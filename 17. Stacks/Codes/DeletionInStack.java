package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class DeletionInStack {

    static void deleteFromBottom(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();

        while (st.size() > 1)
            temp.push(st.pop());

        st.pop();

        while (!temp.isEmpty())
            st.push(temp.pop());
    }

    static void deleteFromIdx(Stack<Integer> st, int idx) {
        Stack<Integer> temp = new Stack<>();

        while (st.size() > idx+1)
            temp.push(st.pop());

        st.pop();

        while (!temp.isEmpty())
            st.push(temp.pop());
    }

    static void print(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        print(st);
        System.out.print(top+ " ");
        st.push(top);
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
        deleteFromBottom(st);
        print(st);

        System.out.print("Enter the index you want to delete element at: ");
        int idx = sc.nextInt();
        deleteFromIdx(st, idx);
        print(st);
    }
}
