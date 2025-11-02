import java.util.Scanner;

public class PlaceZero {

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

    static void moveZeroToEnd(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean check = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] == 0 && arr[j+1] != 0) {
                    swapInArray(arr, j, j + 1);
                    check = true;
                }
            }
            if (!check)
                return;
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
        moveZeroToEnd(arr);
        System.out.println("Modified:");
        printArray(arr);
    }
}
