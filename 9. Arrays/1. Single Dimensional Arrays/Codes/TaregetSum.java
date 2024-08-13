/*
This program contains two varieties of problem - pairSum and tripletSum of which methods requires same parameters
Use one method at a time to avoid errors.
 */

import java.util.Scanner;
public class TargetSum {

    static int pairSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    count++;
            }
        }
        return count;
    }

    static int tripletSum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target)
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter target:");
        int target = sc.nextInt();

        System.out.println("No. of pairs possible: " +pairSum(arr, target));
        System.out.println("No. of triplets possible: " +tripletSum(arr, target));
    }
}