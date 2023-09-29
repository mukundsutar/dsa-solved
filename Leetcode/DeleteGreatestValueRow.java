package Leetcode;

import java.util.*;

public class DeleteGreatestValueRow {
    public static int deleteLargest(int grid[][]) {
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        
        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) { 
            Arrays.sort(grid[i]);
        }
        
        for (int i = 0; i < col; i++) {
            largest=0;
            
            for (int j = 0; j < row; j++) {
                largest= Math.max(largest, grid[j][i]);
            }
            sum = sum + largest;
        }

        return sum;
    }

    public static void main(String[] args) {
        int grid[][] = { { 1,2,4 }, { 3,3,1} };

        System.out.println(deleteLargest(grid));
    }
}
