/*
    Given a rotated sorted array.
    Find the index of the minimum element in the array. All elements in the array are unique.
    A rotated sorted array is a sorted array on which rotation operation has been performed few number of times.

    Input: arr[] = {3, 4, 5, 1, 2}
    Output: 3
 */

import java.util.Scanner;

public class Minimum {

    static int findMin(int[] arr) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int min = Integer.MAX_VALUE;

        while (st <= end) {
            int mid = st + (end - st)/2;
            if (arr[mid] <= arr[n-1]) {
                min = mid;
                end = mid - 1;
            } else st = mid + 1;
        }
        return min;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Minimum element present at index: " +findMin(arr));
    }
}
