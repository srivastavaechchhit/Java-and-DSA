package hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target - nums[i];
            if (mp.containsKey(partner)) {
                ans = new int[]{i, mp.get(partner)};
                return ans;
            }
            mp.put(nums[i], i);
        }
        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.printf("Enter %d elements: ", size);
        for (int i = 0; i < size; i++)
            nums[i] = sc.nextInt();

        System.out.print("Enter the target: ");
        int tgt = sc.nextInt();

        for (int i : twoSum(nums, tgt))
            System.out.print(i+ " ");
        System.out.println();
    }
}
