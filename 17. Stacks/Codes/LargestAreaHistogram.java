package Stacks;
import java.util.Stack;

public class LargestAreaHistogram {
    static void main() {
        int[] heights = {2, 1, 5, 6, 2, 3};
        int n = heights.length;

        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        // Calculating nse
        st.push(n-1);
        nse[n-1] = n;
        for (int i = n-2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // Emptying the Stack
        while (!st.isEmpty()) st.pop();

        // Calculating pse
        st.push(0);
        pse[0] = -1;
        for (int i = 1; i <= n-1; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // Maximum area of Rectangle
        int max = -1;
        for (int i = 0; i <= n-1; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        System.out.println("Maximum Area of Histogram is: " +max);
    }
}
