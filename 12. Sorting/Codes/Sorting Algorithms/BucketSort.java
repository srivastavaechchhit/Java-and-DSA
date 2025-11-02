import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {

    static void printArray(float[] arr) {
        for (float i : arr)
            System.out.print(i+ " ");
        System.out.println();
    }

    static void bucketSort(float[] arr) {
        int n = arr.length;

        // Buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        // Create empty buckets
        for (int i = 0; i < n; i++)
            buckets[i] = new ArrayList<>();

        // Add elements into buckets
        for (float v : arr) {
            int bucketIndex = (int) v * n;
            buckets[bucketIndex].add(v);
        }

        // Sort each bucket individually
        for (ArrayList<Float> bucket : buckets)
            Collections.sort(bucket);

        // Merge buckets to get sorted array
        int index = 0;
        for (ArrayList<Float> currBucket : buckets) {
            for (Float aFloat : currBucket)
                arr[index++] = aFloat;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        float[] arr = new float[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextFloat();

        System.out.println("Original Array:");
        printArray(arr);

        bucketSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
