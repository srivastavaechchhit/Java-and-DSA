/*
    Given an array of positive and negative integers.
    Print all negative integers followed by positive integers in linear time and constant space.

    Input: arr[] = {19, -20, 7, -4, -13, 11, -5, 3}
    Output: arr[] = {-20, -4, -13, -5, 7, 11, 19, 3}
 */

import java.util.Scanner;

public class SortPosNeg {

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
        int l = 0, r = arr.length-1;
        while (l <= r) {
            while (arr[l] < 0) l++;
            while ((arr[r] >= 0)) r--;

            if (l < r) {
                swapInArray(arr, l, r);
                l++;
                r--;
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

        System.out.println("Original Array:");
        printArray(arr);

        sort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
