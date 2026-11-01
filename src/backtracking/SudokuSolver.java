package backtracking;


public class SudokuSolver {

    static int check = 0;

    static void displayBoard(char[][] sudoku) {
        int n = sudoku.length;
        for (char[] chars : sudoku) {
            for (int j = 0; j < n; j++)
                System.out.print(chars[j]+ " ");
            System.out.println();
        }
        System.out.println();
    }

    static boolean isSafe(char[][] sudoku, int row, int col, char num) {
        // Check Row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == num)
                return false;
        }

        // Check Column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == num)
                return false;
        }

        // Check 3x3 grid
        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;
        for (int i = sRow; i < sRow+3; i++) {
            for (int j = sCol; j < sCol+3; j++) {
                if (sudoku[i][j] == num)
                    return false;
            }
        }
        return true;
    }

    static void solve(char[][] sudoku, int row, int col) {
        if (row == 9) {
            check = 1;
            return;
        }
        else if (sudoku[row][col] != '.') {
            if (col != 8) solve(sudoku, row, col+1);
            else solve(sudoku, row+1, 0);
        }
        else {
            for (char ch = '1'; ch <= '9'; ch++) {
                if (isSafe(sudoku, row, col, ch)) {
                    sudoku[row][col] = ch;
                    if (col != 8) solve(sudoku, row, col+1);
                    else solve(sudoku, row+1, 0);

                    if (check == 1) return;
                    sudoku[row][col] = '.';     // backtracking
                }
            }
        }
    }

    static void main() {
        char[][] sudoku = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                           {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                           {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                           {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                           {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                           {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                           {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                           {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                           {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solve(sudoku, 0, 0);
        displayBoard(sudoku);
    }
}
