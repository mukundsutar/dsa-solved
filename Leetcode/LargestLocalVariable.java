package Leetcode;

public class LargestLocalVariable {
    public static void largestLocal(int grid[][]) {
        int n = grid.length - 2;
        int startRow = 0;
        int startCol = 0;
        int endRow = 0;
        int endCol = 0;
        int maxGrid[][] = new int[n][n];
        int largest = Integer.MIN_VALUE;

        // to traverse 3x3 matrix in the grid
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (startRow != grid.length - 3 && startCol != grid[0].length - 3) {
                    endRow = startRow + 3;
                    endCol = startCol + 3;
                }
                // to find largest in 3x3 matrix
                for (int i = startRow; i < endRow; i++) {
                    for (int j = startCol; j < endCol; j++) {
                        if (grid[i][j] > largest) {
                            largest = grid[i][j];
                        }
                    }
                }
                maxGrid[x][y] = largest;
                largest = Integer.MIN_VALUE;
            }
            startCol++;
            startRow++;
        }

        for (int i = 0; i < maxGrid.length; i++) {
            for (int j = 0; j < maxGrid[0].length; j++) {
                System.out.print(maxGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 2, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };

        largestLocal(grid);
    }
}
