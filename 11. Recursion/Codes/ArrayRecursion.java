public class ArrayRecursion {

    static void printArray(int[] arr, int idx) {
        if (idx == arr.length) return;
        System.out.println(arr[idx]+ " ");
        printArray(arr, idx + 1);
    }

    static int findMax(int[] arr, int idx) {
        if (idx == arr.length-1) return arr[idx];
        return Math.max(arr[idx], findMax(arr, idx+1));
    }

    static int findSum(int[] arr, int idx) {
        if (idx == arr.length) return 0;
        return arr[idx] + findSum(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {20, 2, 6, 21, 19, 3};
        printArray(arr, 0);
        System.out.println("Max: " +findMax(arr, 0));
        System.out.println("Sum: " +findSum(arr, 0));
    }
}
