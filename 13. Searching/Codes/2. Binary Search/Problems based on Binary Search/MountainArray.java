/*
    An array arr is a mountain if the following properties hold:
    1. arr.length >= 3
    2. There exists some i with 0 < i < arr.length-1 such that
       (a) arr[0] < arr[1] < ... < arr[i-1] < arr[i]
       (b) arr[i] > arr[i+1] > ... > arr[arr.length - 1]
    Given a mountain array arr.
    Return the index i such that arr[0] < arr[1] < ... < arr[i-1] < arr[i] > arr[i+1] > ... > arr[arr.length-1].
 */

import java.util.Scanner;

public class MountainArray {

    static int peakIndex (int[] arr) {
        int n = arr.length;
        int st = 0, end = n-1;
        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1])
                return mid;
            if (arr[mid] < arr[mid+1]) {
                ans = mid;
                st = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Peak Index: " +peakIndex(arr));
    }
}
