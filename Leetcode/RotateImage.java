package Leetcode;

public class RotateImage {
    public static void rotate(int matrix[][]) {
        int len = matrix.length; // This is n * n matrix so, we don't need column length
        // First we have to convert row --> column
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // now we have to reverse the array.
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - 1 - j];
                matrix[i][len - 1 - j] = temp;
            }
        }

        printArray(matrix);
    }

    public static void printArray(int matrix[][]) {
        System.out.print("{");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("]");
        }

        System.out.println("}");
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotate(matrix);
    }
}
