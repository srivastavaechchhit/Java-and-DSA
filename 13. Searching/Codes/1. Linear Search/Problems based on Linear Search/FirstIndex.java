import java.util.Scanner;

public class FirstIndex {

    static int findFirst(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
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

        int ans = findFirst(arr, x);

        if (ans != -1)
            System.out.println("First Index of " +x+ " is: " +ans);
        else
            System.out.println(x+ " not found. Index: " +ans);
    }
}
