import java.util.Scanner;

public class SelectionSort {

    static void printArray(int[] arr) {
        for (int ints : arr)
            System.out.print(ints+ " ");
        System.out.println();
    }

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {

            // to find the minimum element in unsorted part of the array
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;
            }

            // swapping the minimum element found with the current element
            if (min_index != i)
                swapInArray(arr, i, min_index);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Original:");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted:");
        printArray(arr);
    }
}
