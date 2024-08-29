import java.util.ArrayList;
import java.util.Scanner;

public class FindAllIndices {

    static ArrayList<Integer> allIndices(int[] arr, int target, int idx) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (idx == arr.length) return ans;
        if (arr[idx] == target) ans.add(idx);
        ans.addAll(allIndices(arr, target, idx + 1));
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in the array:");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        System.out.println("Enter number to be searched:");
        int x = sc.nextInt();

        System.out.println(allIndices(arr, x, 0));
    }
}