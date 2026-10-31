package BackTracking;
import java.util.Scanner;

public class Nknights {

    static int maxKnights = -1;
    static int totalKnights = 4;

    static void displayBoard(char[][] chessBoard) {
        int n = chessBoard.length;
        for (char[] chars : chessBoard) {
            for (int j = 0; j < n; j++)
                System.out.print(chars[j]+ " ");
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(char[][] chessBoard, int row, int col) {
        int n = chessBoard.length;
        int i, j;
        // 2 Up, 1 Right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && chessBoard[i][j] == 'K') return false;

        // 2 Up, 1 Left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && chessBoard[i][j] == 'K') return false;

        // 2 Down, 1 Right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && chessBoard[i][j] == 'K') return false;

        // 2 Down, 1 Left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && chessBoard[i][j] == 'K') return false;

        // 2 Right, 1 Up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && chessBoard[i][j] == 'K') return false;

        // 2 Right, 1 Down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && chessBoard[i][j] == 'K') return false;

        // 2 Left, 1 Up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && chessBoard[i][j] == 'K') return false;

        // 2 Left, 1 Down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && chessBoard[i][j] == 'K') return false;

        return true;
    }

    static void placeKnights(char[][] chessBoard, int row, int col, int numKnights) {
        int n = chessBoard.length;
        if (row == n) {
            if (numKnights == totalKnights)
                displayBoard(chessBoard);
            maxKnights = Math.max(maxKnights, numKnights);
            return;
        } else if (isSafe(chessBoard, row, col)) {
            chessBoard[row][col] = 'K';
            if (col != n-1)
                placeKnights(chessBoard, row, col + 1, numKnights+1);
            else
                placeKnights(chessBoard, row + 1, 0, numKnights+1);

            // backtracking
            chessBoard[row][col] = '.';
        }
        if (col != n-1)
            placeKnights(chessBoard, row, col+1, numKnights);
        else
            placeKnights(chessBoard, row+1, 0, numKnights);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        char[][] chessBoard = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                chessBoard[i][j] = '.';
        }
        placeKnights(chessBoard, 0, 0, 0);
        System.out.println("Maximum number of knights: " +maxKnights);
    }
}
