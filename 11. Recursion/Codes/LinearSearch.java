import java.util.Scanner;

public class LinearSearch {

    static boolean searchInArray(int[] arr, int target, int idx) {
        if (idx == arr.length) return false;
        if (arr[idx] == target) return true;
        return searchInArray(arr, target, idx + 1);
    }

    static int findIndex(int[] arr, int target, int idx) {
        if (idx == arr.length) return -1;
        if (arr[idx] == target) return idx;
        return findIndex(arr, target, idx + 1);
    }

    static void findAllIndices(int[] arr, int target, int idx) {
        if (idx == arr.length) return;
        if (arr[idx] == target) System.out.print(idx+ " ");
        findAllIndices(arr, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        System.out.println("Enter number to be searched:");
        int x = sc.nextInt();

        if (searchInArray(arr, x, 0)) System.out.println("YES");
        else System.out.println("NO");

        System.out.println(findIndex(arr, x, 0));

        findAllIndices(arr, x, 0);
    }
}
