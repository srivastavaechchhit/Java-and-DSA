public class Traversing {

    static void usingForLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    static void usingForEachLoop(int[] arr) {
        for (int num : arr)
            System.out.println(num);
    }

    static void usingWhileLoop(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {14, 18, 25, 50, 99, 116};

        usingForLoop(arr);
        usingForEachLoop(arr);
        usingWhileLoop(arr);
    }
}