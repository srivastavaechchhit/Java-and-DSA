/*
    Given an array of size n containing only 0s, 1s and 2s.
    Sort the array in ascending order.

    Input: arr[] = {0, 2, 1, 2, 0, 0}
    Output: arr[] = {0, 0, 0, 1, 2, 2}
 */

import java.util.Scanner;

public class Sort012 {

    static void printArray(int[] arr){
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
        int lo = 0, mid = 0, hi = arr.length-1;

        // Explore the Unknown Region
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swapInArray(arr, mid, lo);
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swapInArray(arr, mid, hi);
                hi--;
            }
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Original array:");
        printArray(arr);

        sort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
