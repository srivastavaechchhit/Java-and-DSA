/*
  This program has two approaches - a basic and an advanced, written in two separate methods but with the same name.
  It is advised to go with only one at a time along with its respective method call to avoid errors.

  Thank You!
 */

import java.util.Scanner;
public class SuffixArray {

    static void printArray(int[] arr) {
        for (int nums : arr)
            System.out.print(nums+" ");
        System.out.println();
    }

    static int[] makeSuffixSumArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int k = n-1;
        ans[k--] = arr[n-1];

        for (int i = n-2; i >= 0 ; i--)
            ans[k--] = arr[i] + arr[i+1];
        return ans;
    }

    static void makeSuffixSumArray(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--)
            arr[i] += arr[i+1];
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

        System.out.println("Suffix Sum Array:");
        printArray(makeSuffixSumArray(arr););
        makeSuffixSumArray(arr);
        printArray(arr);
    }
}
