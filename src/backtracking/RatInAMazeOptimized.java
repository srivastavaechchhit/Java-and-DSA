package backtracking;


public class RatInAMazeOptimized {

    static int maze(int startRow, int startCol, int endRow, int endCol, int[][] maze) {
        if (startRow < 0 || startCol < 0) return 0;
        if (startRow > endRow || startCol > endCol) return 0;
        if (startRow == endRow && startCol == endCol)
            return 1;
        if (maze[startRow][startCol] == 0) return 0;
        if (maze[startRow][startCol] == -1) return 0;

        maze[startRow][startCol] = -1;

        // go right
        int rightWays = maze(startRow, startCol+1, endRow, endCol, maze);

        // go left
        int leftWays = maze(startRow, startCol-1, endRow, endCol, maze);

        // go up
        int upWays = maze(startRow-1, startCol, endRow, endCol, maze);

        // go down
        int downWays = maze(startRow+1, startCol, endRow, endCol, maze);

        maze[startRow][startCol] = 1;

        return rightWays + leftWays + upWays + downWays;
    }

    static void printPath(int startRow, int startCol, int endRow, int endCol, String path, int[][] maze) {
        if (startRow < 0 || startCol < 0) return;
        if (startRow > endRow || startCol > endCol) return;
        if (startRow == endRow && startCol == endCol) {
            System.out.println(path);
            return;
        }
        if (maze[startRow][startCol] == 0) return;
        if (maze[startRow][startCol] == -1) return;

        maze[startRow][startCol] = -1;

        // go right
        printPath(startRow, startCol+1, endRow, endCol, path+"R", maze);

        // go left
        printPath(startRow, startCol-1, endRow, endCol, path+"L", maze);

        // go up
        printPath(startRow-1, startCol, endRow, endCol, path+"U", maze);

        // go down
        printPath(startRow+1, startCol, endRow, endCol, path+"D", maze);

        // backtracking
        maze[startRow][startCol] = 1;
    }

    static void main() {
        int rows = 3, cols = 4;
        int[][] maze = {{1, 0, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 1}};
        System.out.println("No. of ways: " +maze(0, 0, rows-1, cols-1, maze));
        printPath(0, 0, rows-1, cols-1, "", maze);
    }
}
