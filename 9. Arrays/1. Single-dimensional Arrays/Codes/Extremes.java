import java.util.Arrays;
import java.util.Scanner;
public class Extremes {

    static int[] largestAndSmallest(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }

    static int[] k_thSmallestAndLargest(int[] arr, int k) {
        Arrays.sort(arr);
        return new int[] {arr[k-1], arr[arr.length-k]};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int[] ans = largestAndSmallest(arr);
        System.out.println("Smallest: " +ans[0]);
        System.out.println("Largest: " +ans[1]);

        System.out.println("Enter k:");
        int k = sc.nextInt();

        int[] k_thAns = k_thSmallestAndLargest(arr, k);
        System.out.println(k+ "th smallest: " +k_thAns[0]);
        System.out.println(k+ "th largest: " +k_thAns[1]);
    }
}
