import java.util.Scanner;
public class Matrices {

    static void printMatrix(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints)
                System.out.print(anInt + " ");
            System.out.println();
        }
    }
    static void add(int[][] arr1, int row1, int col1, int[][] arr2, int row2, int col2) {
        if (row1 != row2 || col1 != col2) {
            System.out.println("Invalid input - Addition not possible");
            return;
        }
        int[][] sum = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++)
                sum[i][j] = arr1[i][j] + arr2[i][j];
        }
        printMatrix(sum);
    }

    static void multiply(int[][] arr1, int row1, int col1, int[][] arr2, int row2, int col2) {
        if (row2 != col1) {
            System.out.println("Wrong dimensions - Multiplication not possible");
            return;
        }

        int[][] product = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++)
                    product[i][j] += arr1[i][k] * arr2[k][j];
            }
        }
        printMatrix(product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row1 = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col1 = sc.nextInt();

        int[][] arr1 = new int[row1][col1];

        for (int i = 0; i < row1; i++) {
            System.out.println("Enter " +col1+ " elements and press ENTER");
            for (int j = 0; j < col1; j++)
                arr1[i][j] = sc.nextInt();
        }

        System.out.println("Enter number of rows:");
        int row2 = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col2 = sc.nextInt();

        int[][] arr2 = new int[row2][col2];

        for (int i = 0; i < row2; i++) {
            System.out.println("Enter " +col2+ " elements and press ENTER");
            for (int j = 0; j < col2; j++)
                arr2[i][j] = sc.nextInt();
        }

        System.out.println("Matrix 1:");
        printMatrix(arr1);
        System.out.println("Matrix 2:");
        printMatrix(arr2);
        System.out.println("Addition of Matrix 1 and Matrix 2:");
        add(arr1, row1, col1, arr2, row2, col2);
        System.out.println("Multiplication of Matrix 1 and Matrix 2:");
        multiply(arr1, row1, col1, arr2, row2, col2);
    }
}
