package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutive {

    static int longestConsecutive(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) st.add(num);
        int maxStreak = 0;
        for (int num : st) {
            if (!st.contains(num-1)) {
                int currNum = num;
                int currStreak = 1;
                while (st.contains(currNum+1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.printf("Enter %d elements: ", size);

        for (int i = 0; i < size; i++)
            nums[i] = sc.nextInt();

        System.out.println(longestConsecutive(nums));
    }
}
