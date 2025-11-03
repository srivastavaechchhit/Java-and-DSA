/*
    Write an efficient algorithm that searches for a value target in an m * n integer matrix.
    This matrix has the following properties:
    1. Integers in each row are sorted in ascending from left to right.
    2. Integers in each column are sorted in ascending from top to bottom.

    Input:
    matrix[][] = {{1, 4, 7, 11, 15},
                  {2, 5, 8, 12, 19},
                  {3, 6, 9, 16, 22},
                  {10, 13, 14, 17, 24},
                  {18, 21, 23, 26, 30}}
    target = 18
    Output: true
 */

import java.util.Scanner;

public class SearchMatrix {

    static boolean searchInMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m-1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            if (target < matrix[i][j]) j--;
            else i++;
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
        System.out.println(searchInMatrix(matrix, x));
    }
}
