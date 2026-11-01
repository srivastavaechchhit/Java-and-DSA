package backtracking;


public class Nqueens {

    static void displayBoard(char[][] chessBoard) {
        int n = chessBoard.length;
        for (char[] chars : chessBoard) {
            for (int j = 0; j < n; j++)
                System.out.print(chars[j]+ " ");
            System.out.println();
        }
    }

    static void placeQueens(char[][] chessBoard, int row) {
        int n = chessBoard.length;
        if (row == n) {
            displayBoard(chessBoard);
            System.out.println();
            return;
        }
        for (int j = 0; j < n; j++) {
            if (isSafe(chessBoard, row, j)) {
                chessBoard[row][j] = 'Q';
                placeQueens(chessBoard, row+1);
                chessBoard[row][j] = '.';    // backtracking
            }
        }
    }

    static boolean isSafe(char[][] chessBoard, int row, int col) {
        int n = chessBoard.length;

        // Check row
        for (int j = 0; j < n; j++) {
            if (chessBoard[row][j] == 'Q')
                return false;
        }

        // Check column
        for (int i = 0; i < n; i++) {
            if (chessBoard[i][col] == 'Q')
                return false;
        }

        // Check North-east
        int i = row - 1;
        int j = col + 1;
        while (i>=0 && j<n) {
            if (chessBoard[i][j] == 'Q') return false;
            i--;
            j++;
        }

        // Check South-east
        i = row;
        j = col;
        while (i<n && j<n) {
            if (chessBoard[i][j] == 'Q') return false;
            i++;
            j++;
        }

        // Check South-west
        i = row;
        j = col;
        while (i<n && j >= 0) {
            if (chessBoard[i][j] == 'Q') return false;
            i++;
            j--;
        }

        // Check North-west
        i = row - 1;
        j = col - 1;
        while (i >= 0 && j >= 0) {
            if (chessBoard[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;
    }

    static void main() {
        int n = 4;
        char[][] chessBoard = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                chessBoard[i][j] = '.';
        }
        placeQueens(chessBoard, 0);
    }
}
