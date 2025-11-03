/*
    You are given an m * n integer matrix with the following two properties:
    1. Each row is sorted in non-decreasing order.
    2. The first integer of each row is greater than the last integer of the previous row.
    Given an integer target, return true if target is in the matrix or false, otherwise.

    Input:
    matrix[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}
    target = 3
    Output: true
 */

import java.util.Scanner;

public class Matrix {

    static boolean searchMatrix (int[][] matrix, int target) {

        int n = matrix.length, m = matrix[0].length;
        int st = 0, end = n * m - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            int midElt = matrix[mid/m][mid%m];

            if (midElt == target)
                return true;
            else if (midElt < target)
                st = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter " +col+ " elements then ENTER:");
            for (int j = 0; j < col; j++)
                matrix[i][j] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();
        System.out.println(searchMatrix(matrix, x));
    }
}
