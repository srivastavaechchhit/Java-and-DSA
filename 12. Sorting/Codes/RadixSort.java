import java.util.Scanner;

public class RadixSort {

    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i+ " ");
        System.out.println();
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        return max;
    }

    static void countSort(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];

        int max = findMax(arr);
        int[] count = new int[max+1];

        // Make Frequency Array
        for (int j : arr)
            count[(j / place) % 10]++;

        // Make Prefix Sum Array
        for (int i = 1; i < count.length; i++)
            count[i] += count[i-1];

        for (int i = n-1; i >= 0; i--) {
            int idx = count[(arr[i]/place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place) % 10]--;
        }

        // Overwrite the original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    static void radixSort(int[] arr) {
        int max = findMax(arr);

        for (int place = 1; max/place > 0; place *= 10) {
            countSort(arr, place);
        }
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

        radixSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
