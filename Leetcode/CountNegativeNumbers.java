package Leetcode;

public class CountNegativeNumbers {
    public static int countNegative(int grid[][]) {
        int count=0;
        int row=grid.length;
        int col=grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j]<0) {
                    count++;
                }
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        int grid[][] = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };

        System.out.println(countNegative(grid));
    }
}
