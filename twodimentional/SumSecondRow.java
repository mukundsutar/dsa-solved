package twodimentional;

import Arrays.Subarrays;

public class SumSecondRow {
    public static int printSum(int matrix[][]) {
        int sum = 0;
        int row = 2;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == row - 1) {
                    sum = matrix[i][j] + sum;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 } };

        System.out.println("Sum of elements in Second Row= " + printSum(matrix));
    }
}
