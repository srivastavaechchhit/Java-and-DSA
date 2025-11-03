import java.util.Scanner;

public class RecursiveBinarySearch {

    static boolean searchInArray(int[] arr, int target, int st, int end) {
        if (st > end)
            return false;

        int mid = st + (end - st)/2;
        if (target == mid)
            return true;
        else if (target < arr[mid])
            return searchInArray(arr, target, 0, mid-1);
        else
            return searchInArray(arr, target, mid+1, end);
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

        if (searchInArray(arr, x, 0, size-1))
            System.out.println("Element found.");
        else System.out.println("Element not found.");
    }
}
