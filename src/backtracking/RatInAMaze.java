package backtracking;

import java.util.Scanner;

public class RatInAMaze {

    static int ratInAMaze_2D(int startRow, int startCol, int endRow, int endCol) {
        if (startRow > endRow || startCol > endCol) return 0;
        if (startRow == endRow) return 1;

        int downWays = ratInAMaze_2D(startRow + 1, startCol, endRow, endCol);
        int rightWays = ratInAMaze_2D(startRow, startCol + 1, endRow, endCol);

        return downWays + rightWays;
    }

    static void printPath_2D(int startRow, int startCol, int endRow, int endCol, String path) {
        if (startRow > endRow || startCol > endCol) return;
        if (startRow == endRow && startCol == endCol) {
            System.out.println(path);
            return;
        }
        // go down
        printPath_2D(startRow + 1, startCol, endRow, endCol, path + "D");

        // go right
        printPath_2D(startRow, startCol + 1, endRow, endCol, path + "R");
    }

    static int ratInAMaze_4D(int startRow, int startCol, int endRow, int endCol, String path, boolean[][] isVisited) {
        if (startRow < 0 || startCol < 0) return 0;
        if (startRow > endRow || startCol > endCol) return 0;
        if (isVisited[startRow][startCol]) return 0;
        if (startRow == endRow && startCol == endCol) return 1;

        isVisited[startRow][startCol] = true;

        // go left
        int leftWays = ratInAMaze_4D(startRow - 1, startCol, endRow, endCol, path + "U", isVisited);

        // go right
        int rightWays = ratInAMaze_4D(startRow + 1, startCol, endRow, endCol, path + "D", isVisited);

        // go up
        int upWays = ratInAMaze_4D(startRow, startCol - 1, endRow, endCol, path + "L", isVisited);

        // go down
        int downWays = ratInAMaze_4D(startRow, startCol + 1, endRow, endCol, path + "R", isVisited);

        // backtracking
        isVisited[startRow][startCol] = false;

        return leftWays + rightWays + upWays + downWays;
    }

    static void printPath_4D(int startRow, int startCol, int endRow, int endCol, String path, boolean[][] isVisited) {
        if (startRow < 0 || startCol < 0) return;
        if (startRow > endRow || startCol > endCol) return;
        if (isVisited[startRow][startCol]) return;
        if (startRow == endRow && startCol == endCol) {
            System.out.println(path);
            return;
        }

        isVisited[startRow][startCol] = true;

        // go left
        printPath_4D(startRow - 1, startCol, endRow, endCol, path + "U", isVisited);

        // go right
        printPath_4D(startRow + 1, startCol, endRow, endCol, path + "D", isVisited);

        //go up
        printPath_4D(startRow, startCol - 1, endRow, endCol, path + "L", isVisited);

        // go down
        printPath_4D(startRow, startCol + 1, endRow, endCol, path + "R", isVisited);

        // backtracking
        isVisited[startRow][startCol] = false;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int col = sc.nextInt();

        System.out.println("No. of ways (2D): " +ratInAMaze_2D(1, 1, row, col));
        printPath_2D(1, 1, row, col, "");

        boolean[][] isVisited = new boolean[row][col];

        System.out.println("No. of ways (4D): " +ratInAMaze_4D(0, 0, row-1, col-1, "", isVisited));
        printPath_4D(0, 0, row - 1, col - 1, "", isVisited);
    }
}
