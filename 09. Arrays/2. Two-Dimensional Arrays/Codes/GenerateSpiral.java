import java.util.Scanner;

public class GenerateSpiral {

    static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int nums : arr)
                System.out.print(nums+ " ");
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int curr = 1;
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;

        while (curr <= n*n) {

//            TopRow --> leftCol to rightCol
            for (int i = leftCol; i <= rightCol && curr <= n*n; i++)
                matrix[topRow][i] = curr++;
            topRow++;

//            RightColumn --> topRow to bottom Row
            for (int i = topRow; i <= bottomRow && curr <= n*n; i++)
                matrix[i][rightCol] = curr++;
            rightCol--;

//            BottomRow --> rightCol to leftCol
            for (int i = rightCol; i >= leftCol && curr <= n*n; i--)
                matrix[bottomRow][i] = curr++;
            bottomRow--;

//            LeftColumn --> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && curr <= n*n; i--)
                matrix[i][leftCol] = curr++;
            leftCol++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        printMatrix(generateSpiralMatrix(n));
    }
}
