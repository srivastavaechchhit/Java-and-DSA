import java.util.Scanner;
public class Rotate {

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

    static void makeTranspose(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++)
                swapInMatrix(matrix, i, j);
        }
    }

    static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;

        while (left < right) {
            swapInArray(arr, left, right);
            left++;
            right--;
        }
    }

    static void rotateMatrix(int[][] matrix, int row, int col) {
        makeTranspose(matrix, row, col);
        for (int i = 0; i < row; i++)
            reverseArray(matrix[i]);
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

        System.out.println("Original Matrix:");
        printMatrix(matrix);
        System.out.println("Rotated Matrix:");
        rotateMatrix(matrix, row, col);
        printMatrix(matrix);
    }
}
