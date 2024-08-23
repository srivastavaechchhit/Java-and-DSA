import java.util.Scanner;

public class PrintSpiral {

    static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int nums : arr)
                System.out.print(nums+ " ");
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int row, int col) {
        int topRow = 0, bottomRow = row-1, leftCol = 0, rightCol = col-1;
        int totalElements = 0;

        while (totalElements < row * col) {

//            TopRow --> leftCol to rightCol
            for (int i = leftCol; i <= rightCol && totalElements < row * col; i++) {
                System.out.print(matrix[topRow][i]+ " ");
                totalElements++;
            }
            topRow++;

//            RightColumn --> topRow to bottom Row
            for (int i = topRow; i <= bottomRow && totalElements < row * col; i++) {
                System.out.print(matrix[i][rightCol]+ " ");
                totalElements++;
            }
            rightCol--;

//            BottomRow --> rightCol to leftCol
            for (int i = rightCol; i >= leftCol && totalElements < row * col; i--) {
                System.out.print(matrix[bottomRow][i]+ " ");
                totalElements++;
            }
            bottomRow--;

//            LeftColumn --> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElements < row * col; i--) {
                System.out.print(matrix[i][leftCol]+ " ");
                totalElements++;
            }
            leftCol++;
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
            System.out.println("Enter " + col + " elements and press ENTER");
            for (int j = 0; j < col; j++)
                matrix[i][j] = sc.nextInt();
        }
        System.out.println("Matrix:");
        printMatrix(matrix);
        printSpiralOrder(matrix, row, col);
    }
}
