import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter number of columns:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter " + col + " elements and press ENTER:");
            for (int j = 0; j < col; j++)
                arr[i][j] = sc.nextInt();
        }

        // printing the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
