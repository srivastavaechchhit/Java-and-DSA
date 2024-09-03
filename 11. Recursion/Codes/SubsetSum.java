import java.util.Scanner;

public class SubsetSum {

    static void printSubsetSum(int[] arr, int n, int idx, int currSubSum) {
        if (idx >= n) {
            System.out.println(currSubSum);
            return;
        }
        printSubsetSum(arr, n, idx + 1, currSubSum + arr[idx]);
        printSubsetSum(arr, n, idx + 1, currSubSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        printSubsetSum(arr, size, 0, 0);
    }
}
