package Stacks;
import java.util.Stack;

public class CelebrityProblem {

    static int celebrity(int[][] M) {
        int n = M.length;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++)
            st.push(i);

        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if (M[v1][v2] == 0) st.push(v1);        // v1 is potential celebrity
            else if (M[v2][v1] == 0) st.push(v2);   // v2 is potential celebrity
        }
        if (st.isEmpty()) return -1;
        int potential = st.pop();

        for (int i = 0; i < n; i++) {
            if (M[potential][i] == 1)
                return -1;
        }
        for (int i = 0; i < n; i++) {
            if (i == potential) continue;
            if (M[i][potential] == 0)
                return -1;
        }
        return potential;
    }

    static void main() {
        int[][] M = {{0, 1, 0}, {0, 0, 0}, {0, 1, 0}};
        if (celebrity(M) == -1)
            System.out.println("No Celebrity");
        else
            System.out.println(celebrity(M)+ " is Celebrity.");
    }
}
