package Leetcode;

public class RotateImage {
    public static void rotate(int matrix[][]) {
        int rotatedMat[][] = new int[matrix.length][matrix[0].length];

        int len = matrix.length - 1;
        int arr[] = new int[matrix.length * matrix.length];
        int count = 0;

        for (int i = len; i >= 0; i--) {
            for (int j = 0; j <= len; j++) {
                if (arr[count] < len * len) {
                    arr[count] = matrix[i][j];
                }
                count++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = arr[3+j];
                count++;
            }
        }

        boolean flag = false;

        printArray(matrix, arr, true);
    }

    public static void printArray(int matrix[][], int arr[], boolean flag) {
        if (flag == true) {
            System.out.print("{");

            for (int i = 0; i < matrix.length; i++) {
                System.out.print("[");
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.print("]");
            }

            System.out.println("}");

        } else {
            System.out.print("[");

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println("]");
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        rotate(matrix);
    }
}
