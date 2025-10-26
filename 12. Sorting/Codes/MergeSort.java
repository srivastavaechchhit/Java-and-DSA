import java.util.Scanner;

public class MergeSort {

    static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i+ " ");
        System.out.println();
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] left_arr = new int [n1];
        int[] right_arr = new int [n2];
        int i, j, k;

        for (i = 0; i < n1; i++) left_arr[i] = arr[left + i];
        for (j = 0; j < n2; j++) right_arr[j] = arr[mid + 1 + j];
        i = 0;
        j = 0;
        k = left;

        while (i < n1 && j < n2) {
            if (left_arr[i] < right_arr[j])
                arr[k++] = left_arr[i++];
            else
                arr[k++] = right_arr[j++];
        }

        while (i < n1)
            arr[k++] = left_arr[i++];

        while (j < n2)
            arr[k++] = right_arr[j++];
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
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

        mergeSort(arr, 0, size-1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
