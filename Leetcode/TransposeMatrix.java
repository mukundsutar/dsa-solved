package Leetcode;

public class TransposeMatrix {
    public static int[][] transpose(int matrix[][]) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int transMatrix[][] = new int[colSize][rowSize];

        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                transMatrix[col][row]= matrix[row][col];
            }
        }

        return transMatrix;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
    }
}
