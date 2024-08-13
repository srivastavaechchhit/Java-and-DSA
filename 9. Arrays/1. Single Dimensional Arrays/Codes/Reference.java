public class Reference {

    static void printArray(int[] arr) {
        for (int nums : arr)
            System.out.print(nums+ " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;

        System.out.println("Original Array:");
        printArray(arr);

        // Trying to copy arr
        int[] arr2 = arr;
        System.out.println("Copied Array:");
        printArray(arr2);

        // Trying to change some values in arr2
        arr2[0] = 0;
        arr2[1] = 0;

        System.out.println("Original Array after changing the values in arr2:");
        printArray(arr);    // 0 0 7 8 9

        System.out.println("Copied Array after changing the values in arr2:");
        printArray(arr2);   // 0 0 7 8 9
    }
}