package Queues;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;

public class FirstNegative {

    static long[] printFirstNegativeInteger(long[] A, int N, int K) {
        long[] res = new long[N-K+1];
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            if (A[i] < 0) q.add(i);
        }

        for (int i = 0; i < N-K+1; i++) {
            if (!q.isEmpty() && q.peek() < i) q.remove();
            if (!q.isEmpty() && q.peek() <= i+K-1) res[i] = A[q.peek()];
            else if (q.isEmpty()) res[i] = 0;
            else res[i] = 0;
        }
        return res;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        long[] A = new long[size];
        System.out.print("Enter " +size+ " elements: ");

        for (int i = 0; i < size; i++)
            A[i] = sc.nextLong();

        System.out.print("Enter the window size: ");
        int K = sc.nextInt();

        long[] ans = printFirstNegativeInteger(A, size, K);
        int n = ans.length;

        for (int i = 0; i < n; i++) {
            if (i == 0) System.out.print("[" +ans[i]+ ", ");
            else if (i == n-1) System.out.print(ans[i]+ "]");
            else System.out.print(ans[i] + ", ");
        }
        System.out.println();
    }
}
