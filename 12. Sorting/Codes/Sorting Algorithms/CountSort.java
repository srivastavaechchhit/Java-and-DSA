import java.util.Scanner;

public class CountSort {

    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i+ " ");
        System.out.println();
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if (i > max)
                max = i;
        }
        return max;
    }

    static void countSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];

        int max = findMax(arr);
        int[] count = new int[max+1];

        // Make Frequency Array
        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;

        // Make Prefix Sum Array
        for (int i = 1; i < count.length; i++)
            count[i] += count[i-1];

        for (int i = n-1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        // Overwrite the original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
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

        countSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
