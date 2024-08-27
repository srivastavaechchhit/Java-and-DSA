import java.util.Scanner;
public class RangeQuery {

    static void makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            arr[i] += arr[i-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size+1];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 1; i <= size; i++)
            arr[i] = sc.nextInt();

        makePrefixSumArray(arr);

        System.out.println("Enter number of queries:");
        int q = sc.nextInt();

        while (q-- > 0) {

            System.out.println("Enter left index:");
            int l = sc.nextInt();

            System.out.println("Enter right index:");
            int r = sc.nextInt();

            System.out.println("Sum of elements from " +l+ " to " +r+ " is: " +(arr[r] - arr[l-1]));
        }
    }
}
