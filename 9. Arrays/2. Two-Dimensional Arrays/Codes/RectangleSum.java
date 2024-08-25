/*
    This program contains three approaches of the same problem - from the worst case to the best case.
    Choose only one at a time to avoid errors.
    The method named makePrefixSumMatrix is modified according to the method named findSum3 and not suitable for method named findSum2
*/
import java.util.Scanner;

public class RectangleSum {

    static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int nums : arr)
                System.out.print(nums+ " ");
            System.out.println();
        }
    }

    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++)
                sum += matrix[i][j];
        }
        return sum;
    }

    static void makePrefixSumMatrix(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 1; j < col; j++)
                matrix[i][j] += matrix[i][j-1];
        }
        for (int j = 0; j < col; j++) {
            for (int i = 1; i < row; i++)
                matrix[i][j] += matrix[i-1][j];
        }
    }

    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2) {
        makePrefixSumMatrix(matrix);
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            if (r1 > 0)
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            else
                sum += matrix[i][r2];
        }
        return sum;
    }

    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum, up = 0, left = 0, leftUp = 0, ans = 0;
        makePrefixSumMatrix(matrix);
        sum = matrix[l2][r2];
        if (l1 > 0) up = matrix[l1-1][r2];
        if (r1 > 0) left = matrix[l2][r1-1];
        if (l1 > 0 && r1 > 0) leftUp = matrix[l1-1][r1-1];
        ans = sum - left - up + leftUp;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter " + col + " elements and press ENTER");
            for (int j = 0; j < col; j++)
                matrix[i][j] = sc.nextInt();
        }
        System.out.println("Matrix:");
        printMatrix(matrix);

        System.out.println("Enter l1, r1:");
        int l1 = sc.nextInt(), r1 = sc.nextInt();
        System.out.println("Enter l2, r2:");
        int l2 = sc.nextInt(), r2 = sc.nextInt();
        System.out.println("Sum: " +findSum(matrix, l1, r1, l2, r2));
        System.out.println("Sum: " +findSum3(matrix, l1, r1, l2, r2));
    }
}
