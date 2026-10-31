package Stacks;
import java.util.Stack;
import java.util.Scanner;

public class SlidingWindowMaximum {

    static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int z = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = n;
        for (int i = n-2; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] > nums[st.peek()])
                st.pop();
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        int j = 0;
        for (int i = 0; i < n-k+1; i++) {
            if (j >= i+k) j = i;
            int max = nums[j];
            while (j < i+k) {
                max = nums[j];
                j = nge[j];
            }
            ans[z++] = max;
        }
        return ans;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter the size of window: ");
        int k = sc.nextInt();

        int[] ans = maxSlidingWindow(nums, k);

        for (int i : ans)
            System.out.print(i+ " ");
        System.out.println();
    }
}
