import java.util.Arrays;

public class TryMethods {

    static void printArray(int[] arr) {
        for (int nums : arr)
            System.out.print(nums+ " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};

        System.out.println("Original Array:");
        printArray(arr);

        int[] arr2 = arr.clone();

        System.out.println("Copied Array:");
        printArray(arr2);

        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("Original Array after changing values in copied array:");
        printArray(arr);

        System.out.println("Copied Array after changing values in copied array:");
        printArray(arr2);

        int[] arr3 = Arrays.copyOf(arr, arr.length);

        System.out.println("Array copied by 'Arrays.copyOf' method:");
        printArray(arr3);

        int[] arr4 = Arrays.copyOfRange(arr, 1, 3);

        System.out.println("Array copied by 'Arrays.copyOfRange' method:");
        printArray(arr4);

        Arrays.fill(arr2, 0);   // updates each value of array to 0
        System.out.println("Filling array by 0:");
        printArray(arr2);
    }
}