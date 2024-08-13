import java.util.Scanner;
public class ArrayManipulation {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int nums : arr) {
            if (nums > max)
                max = nums;
        }
        return max;
    }

    static int findSecondMax(int[] arr) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                arr[i] = Integer.MIN_VALUE;
        }
        return findMax(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Maximum: " + findMax(arr));
        System.out.println("Second maximum: " + findSecondMax(arr));
    }
}