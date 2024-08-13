import java.util.Scanner;

public class Index {

    static int firstIndex(int[] arr, int x) {
        int index = -1;
        for (int nums : arr) {
            if (nums == x)
                return index;
        }
        return index;
    }

    static int lastIndex(int[] arr, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                index = i;
        }
        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size:");
        int size = sc.nextInt();

        int[] arr = new int [size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter x:");
        int x = sc.nextInt();

        System.out.println("First index of x: " + firstIndex(arr, x));
        System.out.println("Last index of x: " +lastIndex(arr, x));
    }
}