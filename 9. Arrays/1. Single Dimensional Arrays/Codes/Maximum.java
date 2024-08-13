public class Maximum {

    static int maxInArray() {
        int[] arr = {20, 21, 2, 6, 19};
        int max = arr[0];
        for (int nums : arr) {
            if (nums > max)
                max = nums;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum: " +maxInArray());
    }
}