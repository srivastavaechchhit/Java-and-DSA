import java.util.Scanner;

public class InsertionSort {

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

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            
            // inserting arr[i] into sorted left part 0 ... i-1
            while (j > 0 && arr[j] < arr[j-1]) {
                swapInArray(arr, j, j-1);
                j--;
            }
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
        insertionSort(arr);
        System.out.println("Sorted:");
        printArray(arr);
    }
}
