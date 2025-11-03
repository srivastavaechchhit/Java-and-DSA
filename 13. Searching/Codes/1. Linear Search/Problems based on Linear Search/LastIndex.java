import java.util.Scanner;

public class LastIndex {

    static int findLast(int[] arr, int target) {
        int n = arr.length;
        int lastIdx = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                lastIdx = i;
        }
        return lastIdx;
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

        int ans = findLast(arr, x);

        if (ans != -1)
            System.out.println("Last Index of " +x+ " is: " +ans);
        else
            System.out.println(x+ " not found. Index: " +ans);
    }
}
