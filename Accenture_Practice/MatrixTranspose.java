package Accenture_Practice;

public class MatrixTranspose {
    public static void findTranspose(int matrix[][]) {
        int row = 2;
        int col = 3;
        int transpose[][] = new int[col][row];

        printArray(matrix);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        printArray(transpose);
    }

    public static void printArray(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println("]");
        }

        System.out.println("--------------------");

    }

    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 7 }, { 5, 6, 7 } };

        findTranspose(matrix);
    }
}
