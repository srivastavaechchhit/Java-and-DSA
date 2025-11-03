import java.util.Scanner;

public class Occurrence {

    static int countOcc(int[] arr, int target) {
        int count = 0;

        for (int i : arr) {
            if (i == target)
                count++;
        }
        return count;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the element to searched: ");
        int x = sc.nextInt();

        System.out.println(x+ " occurred " +countOcc(arr, x)+ " times.");
    }
}
