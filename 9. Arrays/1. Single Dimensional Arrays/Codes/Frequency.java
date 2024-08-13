import java.util.Scanner;

public class Frequency {
    static int countOccurrences(int[] arr, int x) {
        int count = 0;
        for (int nums : arr) {
            if (nums == x)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " array elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter x:");
        int x = sc.nextInt();   // value to be searched

        int ans = countOccurrences(arr, x);
        System.out.println(x+ " occurred " +ans+ " times in the given array");
    }
}