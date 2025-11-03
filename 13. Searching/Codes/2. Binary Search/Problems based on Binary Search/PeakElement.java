/*
    A peak element is an element that is strictly greater than its neighbours.

    Given a 0-indexed integer array arr, find a peak element and return its index.
    If the array contains multiple peaks, return the index to any of the peaks.

    You may imagine that arr[-1] = nums[n] = -∞.
    In other words, an element is always considered to be strictly greater than a neighbour that is outside the array.
 */

import java.util.Scanner;

public class PeakElement {

    static int findPeakElement(int[] arr){
        int n = arr.length;
        int st = 0, end = n-1;

        while (st <= end) {
            int mid = st + (end-st) / 2;
            if ((mid == 0 || arr[mid-1] < arr[mid]) && (mid == n-1 || arr[mid] > arr[mid+1]))
                return mid;
            if (arr[mid] < arr[mid+1])
                st = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Peak Element: " +findPeakElement(arr));
    }
}
