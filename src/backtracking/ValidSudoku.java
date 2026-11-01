package backtracking;


public class ValidSudoku {

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

    static boolean isValid(char[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == '.') continue;
                char num = sudoku[i][j];
                sudoku[i][j] = '.';
                if (!isSafe(sudoku, i, j, num)) return false;
                sudoku[i][j] = num;
            }
        }
        return true;
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
        System.out.println(isValid(sudoku));
        }
}
