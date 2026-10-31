package BackTracking;

public class RatInADeadMaze {

    static int maze2D(int startRow, int startCol, int endRow, int endCol, int[][] maze) {
        if (startRow > endRow || startCol > endCol) return 0;
        if (startRow == endRow && startCol == endCol) return 1;
        if (maze[startRow][startCol] == 0) return 0;
        return maze2D(startRow,startCol+1, endRow, endCol, maze) + maze2D(startRow+1, startCol, endRow, endCol, maze);
    }

    static void printPath2D(int startRow, int startCol, int endRow, int endCol, String path, int[][] maze) {
        if (startRow > endRow || startCol > endCol) return;
        if (startRow == endRow && startCol == endCol) {
            System.out.println(path);
            return;
        }
        if (maze[startRow][startCol] == 0) return;

        // go right
        printPath2D(startRow,startCol+1, endRow, endCol,path+"R", maze);

        // go down
        printPath2D(startRow+1, startCol, endRow, endCol,path+"D", maze);
    }

    static int maze4D(int startRow, int startCol, int endRow, int endCol, String path, int[][] maze, boolean[][] isVisited) {
        if (startRow < 0 || startCol < 0) return 0;
        if (startRow > endRow || startCol > endCol) return 0;
        if (startRow == endRow && startCol == endCol)
            return 1;
        if (maze[startRow][startCol] == 0) return 0;
        if (isVisited[startRow][startCol]) return 0;

        isVisited[startRow][startCol] = true;

        // go right
        int rightWays = maze4D(startRow, startCol+1, endRow, endCol, path+"R", maze, isVisited);

        // go left
        int leftWays = maze4D(startRow, startCol-1, endRow, endCol, path+"L", maze, isVisited);

        // go up
        int upWays = maze4D(startRow-1, startCol, endRow, endCol, path+"U", maze, isVisited);

        // go down
        int downWays = maze4D(startRow+1, startCol, endRow, endCol, path+"D", maze, isVisited);

        // backtracking
        isVisited[startRow][startCol] = false;

        return rightWays + leftWays + upWays + downWays;
    }

    static void printPath4D(int startRow, int startCol, int endRow, int endCol, String path, int[][] maze, boolean[][] isVisited) {
        if (startRow < 0 || startCol < 0) return;
        if (startRow > endRow || startCol > endCol) return;
        if (startRow == endRow && startCol == endCol) {
            System.out.println(path);
            return;
        }
        if (maze[startRow][startCol] == 0) return;
        if (isVisited[startRow][startCol]) return;

        isVisited[startRow][startCol] = true;

        // go right
        printPath4D(startRow, startCol+1, endRow, endCol, path+"R", maze, isVisited);

        // go left
        printPath4D(startRow, startCol-1, endRow, endCol, path+"L", maze, isVisited);

        // go up
        printPath4D(startRow-1, startCol, endRow, endCol, path+"U", maze, isVisited);

        // go down
        printPath4D(startRow+1, startCol, endRow, endCol, path+"D", maze, isVisited);

        // backtracking
        isVisited[startRow][startCol] = false;
    }

    static void main() {
        int row = 3, col = 4;
        int[][] maze = {{1, 0, 1, 1},
                        {1, 1, 1, 1},
                        {1, 1, 0, 1}};

        boolean[][] isVisited = new boolean[row][col];

        System.out.println("No. of ways (2D): " +maze2D(0, 0, row-1, col-1, maze));
        printPath2D(0,0, row-1, col-1, "", maze);

        System.out.println("No. of ways (4D): " +maze4D(0, 0, row-1, col-1, "", maze, isVisited));
        printPath4D(0, 0, row-1, col-1, "", maze, isVisited);
    }
}
