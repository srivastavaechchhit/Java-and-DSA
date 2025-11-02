import java.util.Scanner;

public class QuickSort {

    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i+ " ");
        System.out.println();
    }

    static void swapInArray(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st+1; i <= end; i++) {
            if (arr[i] <= pivot) cnt++;
        }

        int pivotIdx = st + cnt;
        swapInArray(arr, st, pivotIdx);

        int i = st, j = end;
        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotIdx && j > pivotIdx) {
                swapInArray(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSort(int[] arr, int st, int end) {
        if (st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, size-1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
