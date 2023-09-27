package Leetcode;

import java.util.Arrays;

public class SortMatrixDiagonally {
    public static void diagonalSort(int matrix[][]) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        // int diagonalCount = matrix.length + matrix[0].length - 1;
        // int tempMat[][] = new int[rowSize][colSize];

        // int startRow = rowSize - 1;
        // int endRow = 0;
        // int startCol = colSize - 1;
        // int endCol = 0;

        int diagonalSize = 0;

        if (rowSize > colSize) {
            diagonalSize = colSize;
        } else {
            diagonalSize = rowSize;
        }

        int tempDiagonal[] = new int[diagonalSize];

        // storing values in temporary 1D array
        for (int row = 0; row <rowSize; row++) { // decides row
            for (int col = colSize-1; col >= 0; col--) { // decides col
                int a = row;
                int b = col;
                int c = 0;
                while (row < rowSize-1) { // roq should not be equal to col but instead row
                                                                         // should always be 0
                    

                    tempDiagonal[c] = matrix[a][b];

                    if(a!=0 || b!=colSize-1){
                        a++;
                        b++;
                        c++;
                    }
                }
            }
            Arrays.sort(tempDiagonal);
        }

        //

        for (int k = 0; k < tempDiagonal.length; k++) {
            System.out.print(tempDiagonal[k] + " ");
        }
    }

    public static void main(String[] args) {
        int matrix[][] =  { { 3, 3, 1, 1 },
                            { 2, 2, 1, 2 },
                            { 1, 1, 1, 2 } };

        diagonalSort(matrix);
    }
}
