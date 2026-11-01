package backtracking;


public class KnightTourConfiguration {

    static boolean isValid(int[][] grid, int row, int col, int num) {
        int n = grid.length;
        if (grid[row][col] == n*n-1) return true;
        int i,j;

        // 2 Up, 1 Right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == num+1)
            return isValid(grid, i, j, num+1);

        // 2 Up, 1 Left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == num+1)
            return isValid(grid, i, j, num+1);

        // 2 Down, 1 Right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == num+1)
            return isValid(grid, i, j, num+1);

        // 2 Down, 1 Left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == num+1)
            return isValid(grid, i, j, num+1);

        // 2 Right, 1 Up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == num+1)
            return isValid(grid, i, j, num+1);

        // 2 Right, 1 Down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == num+1)
            return isValid(grid, i, j, num+1);

        // 2 Left, 1 Up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == num+1)
            return isValid(grid, i, j, num+1);

        // 2 Left, 1 Down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == num+1)
            return isValid(grid, i, j, num+1);

        return false;
    }

    static void main() {
        int[][] grid1 = {{0, 11, 16, 5, 20},
                        {17, 4, 19, 10, 15},
                        {12, 1, 8, 21, 6},
                        {3, 18, 23, 14, 9},
                        {24, 13, 2, 7, 22}};
        int[][] grid2 = {{0, 3, 6},
                        {5, 8, 1},
                        {2, 7, 4}};
        if (grid1[0][0] == 0)
            System.out.println(isValid(grid1, 0, 0, 0));
        if (grid2[0][0] == 0)
            System.out.println(isValid(grid2, 0, 0, 0));
    }
}
