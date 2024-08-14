/*
  This program has two approaches - a basic and an advanced, written in two separate methods but with the same name.
  It is advised to go with only one at a time along with its respective method call to avoid errors.

  Thank You!
 */

import java.util.Scanner;
public class Reverse {

    static void printArray(int[] arr) {
        for (int nums : arr)
            System.out.print(nums+ " ");
        System.out.println();
    }

    static void swapInArray(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
    
    static int[] reverseArray(int[] arr) {
        int [] ans = new int[arr.length];
        int j = 0;

        for (int i = arr.length-1; i >= 0 ; i--)
            ans[j++] = arr[i];

        System.out.println("Reversed Array:");
        return ans;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length-1;

        while (i < j)
            swapInArray(arr, i++, j--);
        System.out.println("Reversed Array:");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        printArray(reverseArray(arr));

        reverseArray(arr);
        printArray(arr);
    }
}
