/*
    Given the rotated sorted array of integers, which contains duplicate elements and an integer target.
    Return true if the target is present in the array, otherwise return false.

    Input:
    arr[] = {3, 4, 4, 1, 4, 2}
    target = 4
    Output: true

    Input:
    arr[] = {3, 4, 4, 1, 4, 2}
    target = 0
    Output: false
 */

import java.util.Scanner;

public class RotatedSortedArray_dup {

    static boolean search (int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n-1;

        while (st <= end) {
            int mid = st + (end - st)/2;
            if (target == arr[mid])
                return true;
            else if (arr[st] == arr[mid] && arr[end] == arr[mid]){
                st++;
                end--;
            }
            else if (arr[mid] <= arr[end]) {  // mid to end is sorted
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
        return false;
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

        System.out.println(search(arr, x));
    }
}
