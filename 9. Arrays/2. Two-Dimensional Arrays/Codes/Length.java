public class Length {

    static void findMultiArrayLength(int[][] arr) {
        int array_outer = arr.length;
        int array_inner = arr[0].length;

        System.out.println("Length of array: " +array_outer);
        System.out.println("Length of array of arrays: " +array_inner);
    }

    public static void main(String[] args) {
        int[][] arr = {{5, 6}, {2, 4}, {4, 9}};
        findMultiArrayLength(arr);
    }
}