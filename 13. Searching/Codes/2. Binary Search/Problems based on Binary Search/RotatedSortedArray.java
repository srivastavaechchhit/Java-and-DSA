/*
    Given the rotated sorted array of integers, which contains distinct elements and an integer target.
    Return the index of the target if it is present in the array, otherwise return -1.

    Input:
    arr[] = {3, 4, 5, 1, 2}
    target = 4
    Output: 1
 */

import java.util.Scanner;

public class RotatedSortedArray {

    static int search (int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n-1;

        while (st <= end) {
            int mid = st + (end - st)/2;
            if (target == arr[mid])
                return mid;
            else if (arr[mid] < arr[end]) {  // mid to end is sorted
                if (target > arr[mid] && target <= arr[end])
                    st = mid + 1;
                else
                    end = mid - 1;
            } else {    // st to mid is sorted
                if (target >= arr[st] && target < arr[mid])
                    end = mid - 1;
                else
                    st = mid + 1;
            }
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

        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();

        int ans = search(arr, x);
        if (ans != -1)
            System.out.println(x+ " found at index: " +ans);
        else
            System.out.println(x+ " not found. Index: " +ans);
    }
}

