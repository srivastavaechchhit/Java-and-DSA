public class ArrayReferencing {

static void printArray(int[] arr) {
    for (int nums : arr)
        System.out.print(nums + " ");
    System.out.println();
}

static void changeArray(int[] arr) {
    for (int i = 0; i < arr.length; i++)
        arr[i] = 0;
}

public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 5;
    arr[1] = 6;
    arr[2] = 7;
    arr[3] = 8;
    arr[4] = 9;

    changeArray(arr);
    printArray(arr);
    }
}