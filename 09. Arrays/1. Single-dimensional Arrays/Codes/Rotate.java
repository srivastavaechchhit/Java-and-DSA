/*
  This program has two approaches - a basic and an advanced, written in two separate methods but with the same name.
  It is advised to go with only one at a time along with its respective method call to avoid errors.

  Thank You!
 */

import java.util.Scanner;
public class Rotate {

    static void printArray(int[] arr) {
        for (int nums : arr)
            System.out.print(nums+ " ");
        System.out.println();
    }

    static void swapInArray(int[] arr, int i, int j) {
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    static void reverseInArray(int[] arr, int st, int end) {
        while (st < end)
            swapInArray(arr, st++, end--);
    }

    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length, i = 0;
        k = k % n;
        int[] ans = new int[n];

        for (int j = n - k; j < n; j++)
            ans[i++] = arr[j];
        for (int j = 0; j < n-k; j++)
            ans[i++] = arr[j];
        System.out.println("Rotated array:");
        return ans;
    }

    static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverseInArray(arr, 0, n-k-1);
        reverseInArray(arr, n-k, n-1);
        reverseInArray(arr, 0, n-1);

        System.out.println("Rotated Array:");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter k:");
        int k = sc.nextInt();

        System.out.println("Original array:");
        printArray(arr);

        printArray(rotateArray(arr, k));
        rotateArray(arr, k);
        printArray(arr);
    }
}
