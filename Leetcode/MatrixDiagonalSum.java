package Leetcode;

public class MatrixDiagonalSum {
    public static int diagonalSum(int mat[][]) {
        int row = mat.length;
        int col = mat[0].length;

        int sum = 0;
        int center = row / 2;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    sum = sum + mat[i][j];
                } else if (i + j == row - 1 && i != center && j != center && row % 2 != 0) {
                    sum = sum + mat[i][j];
                } else if (i + j == row - 1 && row % 2 == 0) {
                    sum = sum + mat[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 } };

        System.out.println(diagonalSum(mat));
    }
}
