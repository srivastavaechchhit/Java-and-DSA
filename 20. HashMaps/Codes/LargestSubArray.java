package HashMap;
import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArray {

    static int zeroSumLargestSubarray(int[] arr, int n) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLength = 0, prefSum = 0;
        mp.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if (mp.containsKey(prefSum))
                maxLength = Math.max(maxLength, i-mp.get(prefSum));
            else
                mp.put(prefSum, i);
        }
        return maxLength;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.printf("Enter %d elements: ", size);
        for (int i = 0; i < size; i++)
            nums[i] = sc.nextInt();

        System.out.println("Largest zero subarray: " +zeroSumLargestSubarray(nums, size));
    }
}
