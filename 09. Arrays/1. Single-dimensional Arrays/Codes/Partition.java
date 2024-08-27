import java.util.Scanner;
public class Partition {

    static int findSum(int[] arr) {
        int sum = 0;
        for (int nums : arr)
            sum += nums;
        return sum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum = findSum(arr);

        int prefixSum = 0;
        for (int j : arr) {
            prefixSum += j;
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Partition possible: " +equalSumPartition(arr));
    }
}
