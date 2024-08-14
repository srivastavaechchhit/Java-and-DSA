public class Traversing {

    static void usingForLoop(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j]);
        }
    }

    static void usingForEachLoop(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints)
                System.out.println(anInt);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{5, 6}, {2, 4}, {4, 9}};
        usingForLoop(arr);
        usingForEachLoop(arr);
    }
}