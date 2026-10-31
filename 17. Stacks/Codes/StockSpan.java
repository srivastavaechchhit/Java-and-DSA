package Stacks;
import java.util.Stack;

public class StockSpan {
    static void main() {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;

        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);

        for (int i = 1; i <= n-1; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) st.pop();
            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        for (int i : span)
            System.out.print(i+ " ");
        System.out.println();
    }
}
