package Backtracking;

public class RatGridWay {
    public static int isSafe(int maze[][], int row, int col) {
        // up
        if (maze[row - 1][col] == 1) {
            return 1;
        }

        // right
        if (maze[row][col + 1] == 1) {
            return 2;
        }

        // down
        if (maze[row + 1][col] == 1) {
            return 3;
        }

        // left
        if (maze[row][col - 1] == 1) {
            return 4;
        }

        return 0;
    }

    public static void findRatGridWay(int maze[][], int row, int col, int LR, int LC) {
        // base case

        // recursion kaam

        for (int i = row, j = col; i <= LR && j <= LC; i++, j++) {
            if (isSafe(maze, i, j) == 1) {
                findRatGridWay(maze, row - 1, col, LR, LC);
                
            } else if (isSafe(maze, i, j) == 2) {
                findRatGridWay(maze, row, col + 1, LR, LC);

            } else if (isSafe(maze, i, j) == 3) {
                findRatGridWay(maze, row + 1, col, LR, LC);

            } else if (isSafe(maze, i, j) == 4) {
                findRatGridWay(maze, row, col - 1, LR, LC);

            }
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };

        int LR = maze[0].length;
        int LC = maze.length;
    }
}
