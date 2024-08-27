/*
    This program contains two approaches - brute force and standard.
    Use only one method with its correct method call at once to avoid any errors.
 */
import java.util.Scanner;
public class Transpose {

    static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int nums : arr)
                System.out.print(nums+ " ");
            System.out.println();
        }
    }

    static void swapInMatrix(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    static int[][] makeTranspose(int[][] matrix, int row, int col) {
        int[][] ans = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                ans[i][j] = matrix[j][i];
        }
        return ans;
    }

    static void transposeInPlace(int[][] matrix, int row, int col) {
        for (int i = 0; i < col; i++) {
            for (int j = i; j < row; j++)
                    swapInMatrix(matrix, i, j);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter " +col+ " elements and press ENTER");
            for (int j = 0; j < col; j++)
                matrix[i][j] = sc.nextInt();
        }

        System.out.println("Original matrix:");
        printMatrix(matrix);
        System.out.println("Transpose matrix:");
        printMatrix(makeTranspose(matrix, row, col));
        transposeInPlace(matrix, row, col);
    }
}
