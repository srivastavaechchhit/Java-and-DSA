/*
  This program has two approaches - a basic and an advanced, written in two separate methods but with the same name.
  It is advised to go with only one at a time along with its respective method call to avoid errors.

  Thank You!
 */

import java.util.Scanner;
public class PrefixSum {

    static void printArray(int[] arr) {
        for (int nums : arr)
            System.out.print(nums+ " ");
        System.out.println();
    }

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++)
            pref[i] = pref[i-1] + arr[i];

        return pref;
    }

    static void makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            arr[i] += arr[i-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("Prefix Sum Array:");
        makePrefixSumArray(arr);
        printArray(arr);
    }
}
