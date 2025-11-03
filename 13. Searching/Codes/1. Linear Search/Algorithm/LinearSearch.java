import java.util.Scanner;

public class LinearSearch {

    static boolean search (int[] arr, int target) {
        int n = arr.length;

        for (int i : arr) {
            if (i == target)
                return true;
        }
        return false;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();

        if (search(arr, x))
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}
