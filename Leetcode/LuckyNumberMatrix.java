package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {
    public static List<Integer> findLuckyNumber(int matrix[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(-1);

        int row = matrix.length;
        int col = matrix[0].length;

        System.out.println(row + " " + col);

        int smallest[] = new int[row];

        // check for smallest
        for (int i = 0; i < matrix.length; i++) {
            smallest[i] = Integer.MAX_VALUE;

            for (int j = 0; j < matrix[0].length; j++) {
                if (smallest[i] > matrix[i][j]) {
                    smallest[i] = matrix[i][j];
                }
            }
        }

        // find largest
        int big = Integer.MIN_VALUE;

        for (int i = 0; i < smallest.length; i++) {
            if (smallest[i] > big) {
                big = smallest[i];
            }
        }

        // find index
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (big == matrix[i][j]) {
                    index = j;
                }
            }
        }

        // check largest
        int largeNum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][index] > largeNum) {
                largeNum = matrix[i][index];
            }
        }

        if (largeNum!=big) {
            return result;
        }
        
        result.add(largeNum);

        return result;
    }

    public static void printArray(int smallest[]) {
        System.out.print("[");

        for (int i = 0; i < smallest.length; i++) {
            System.out.print(smallest[i] + " ");
        }

        System.out.println("]");
    }

    public static void main(String[] args) {
        int matrix[][] = {  { 3, 6 },
                            { 7, 1 }, 
                            { 5, 2 }, 
                            { 4, 8 } };

        // findLuckyNumber(matrix);
        System.out.println(findLuckyNumber(matrix));
    }
}
