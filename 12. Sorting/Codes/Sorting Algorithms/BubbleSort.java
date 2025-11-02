import java.util.Scanner;

public class BubbleSort {

    static void printArray(int[] arr) {
        for (int nums : arr)
            System.out.print(nums+ " ");
        System.out.println();
    }

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean check = false;
            for (int j = 0; j < n-i-1; j++) {
                /*
                    last i elements are already at their correct positions -
                    so no need to process them
                 */
                if (arr[j] > arr[j+1]) {
                    swapInArray(arr, j, j + 1);
                    check = true;
                }
            }
            if (!check) return;
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
        bubbleSort(arr);
        System.out.println("Sorted:");
        printArray(arr);
    }
}
