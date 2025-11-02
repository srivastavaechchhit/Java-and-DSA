/*
    Given an array where all its elements are sorted in increasing order except two swapped elements.
    Assuming there are no duplicates elements in the array, sort it in linear time.

    Input: arr [] = {3, 8, 6, 7, 5, 9, 10}
    Output: arr [] = {3, 5, 6, 7, 8, 9, 10}
 */

import java.util.Scanner;

public class SortArray {

    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i+ " ");
        System.out.println();
    }

    static void swapInArray(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void sort(int[] arr) {
        int n = arr.length;
        int x = -1, y = -1;

        if (n <= 1)     // Edge case
            return;

        // Process adjacent elements
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {  // First conflict
                    x = i - 1;
                    y = i;
                } else          // Second Conflict
                    y = i;
            }
        }
        swapInArray(arr, x, y);
    }

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        sort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
