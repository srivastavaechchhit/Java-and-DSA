import java.util.Scanner;

class Unique {

    static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    arr[i] = arr[j] = -1;
            }
        }
        for (int nums : arr) {
            if (nums != -1)
                return nums;
        }
        return -1;
    }
}

class Maximum {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int nums : arr) {
            if (nums > max)
                max = nums;
        }
        return max;
    }

    static int findSecondMax(int[] arr) {
        int max = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                arr[i] = Integer.MIN_VALUE;
        }
        return findMax(arr);
    }
}

class Minimum {

    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int nums : arr) {
            if (nums < min)
                min = nums;
        }
        return min;
    }

    static int findSecondMin(int[] arr) {
        int min = findMin(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min)
                arr[i] = Integer.MAX_VALUE;
        }
        return findMin(arr);
    }
}

class Repeat {

    static int findRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }

    static int findLastRepeating(int[] arr) {
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    ans = arr[i];
            }
        }
        return ans;
    }
}

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " +size+ " elements in the array:");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.println("Unique element: " +Unique.findUnique(arr));
        System.out.println("Maximum: " +Maximum.findMax(arr));
        System.out.println("Second maximum: " +Maximum.findSecondMax(arr));
        System.out.println("Minimum: " +Minimum.findMin(arr));
        System.out.println("Second minimum: " +Minimum.findSecondMin(arr));
        System.out.println("Repeating element: " +Repeat.findRepeating(arr));
        System.out.println("Last repeating elements: " +Repeat.findLastRepeating(arr));
    }
}
