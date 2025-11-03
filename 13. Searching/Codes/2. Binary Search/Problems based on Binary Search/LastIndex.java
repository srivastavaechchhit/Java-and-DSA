/*
    Given a sorted array. Find the last occurrence of a given element x.
    If no occurrence of x is found, return -1.

    Input:
    arr[] = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9}
    x = 5
    Output: 3
 */

import java.util.Scanner;

public class LastIndex {

    static int findLast(int[] arr, int x) {
        int st = 0, end = arr.length - 1;
        int lastIdx = -1;

        while (st <= end) {
            int mid = st + (end-st)/2;
            if (arr[mid] == x) {
                lastIdx = mid;
                st = mid + 1;
            } else if (arr[mid] < x)
                st = mid + 1;
            else
                end = mid - 1;
        }
        return lastIdx;
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

        int ans = findLast(arr, x);

        if (ans != -1)
            System.out.println("Last index of " +x+ " is: " +ans);
        else System.out.println(x+ " not found: " +ans);
    }
}
