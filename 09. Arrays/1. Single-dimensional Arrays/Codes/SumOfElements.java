public class SumOfElements {

    int sumOfArray() {
        int[] arr = {20, 21, 2, 6, 19};
        int sum = 0;
        for (int nums : arr) {
            sum += nums;
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        System.out.println("Sum of elements: " +obj.sumOfArray());
    }
}