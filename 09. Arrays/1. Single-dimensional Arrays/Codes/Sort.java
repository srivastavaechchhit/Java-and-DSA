/*
  This program has two approaches - a basic and an advanced, written in two separate methods but with the same name.
  It is advised to go with only one at a time along with its respective method call to avoid errors.

  Thank You!
 */

import java.util.Scanner;
public class Sort {

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

    static int[] sortZeroesAndOnes(int[] arr) {
        int[] ans = new int [arr.length];
        int zeroes = 0;

        for (int nums : arr) {
            if (nums == 0)
                zeroes++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeroes) ans[i] = 0;
            else ans[i] = 1;
        }
        System.out.println("Sorted:");
        return ans;
    }

    static void sortZeroesAndOnes(int[] arr) {
        int left = 0, right = arr.length-1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) left++;
            if (arr[right] == 1) right--;
        }
        System.out.println("Sorted:");
    }

    static void sortArrayByParity(int[] arr) {
        int left = 0, right = arr.length-1;

        while (left < right) {
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swapInArray(arr, left++, right--);
            }
            if (arr[left] % 2 == 0) left++;
            if (arr[right] % 2 != 0) right--;
        }
    }

    static int[] sortSquares(int[] arr) {
        int n = arr.length, left = 0, right = n-1;
        int k = 0;
        int[] ans = new int[n];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        printArray(sortZeroesAndOnes(arr));
        sortZeroesAndOnes(arr);
        sortArrayByParity(arr);
        sortSquares(arr);
        printArray(arr);
    }
}
