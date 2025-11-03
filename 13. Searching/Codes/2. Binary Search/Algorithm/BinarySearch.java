import java.util.Scanner;

public class BinarySearch {

    static boolean searchInArray(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n-1;

        while(st <= end) {
            int mid = st + (end-st)/2;
            if (target == arr[mid])
                return true;
            else if (target < arr[mid])
                end = mid - 1;
            else st = mid + 1;
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

        if (searchInArray(arr, x) )
            System.out.println("Element found.");
        else System.out.println("Element not found");
    }
}
