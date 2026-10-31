package Stacks;
import java.util.Stack;

public class NextGreaterElement {
    static void main() {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int n = arr.length;

        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n-1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        for (int i : res)
            System.out.print(i+ " ");
        System.out.println();
    }
}
