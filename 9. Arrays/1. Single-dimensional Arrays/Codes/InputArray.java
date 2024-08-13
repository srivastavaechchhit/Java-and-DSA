import java.util.Scanner;
public class InputArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " array elements:");

        // Taking input of elements in an array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing an Array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}