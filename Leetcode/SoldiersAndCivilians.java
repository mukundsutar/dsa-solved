package Leetcode;

public class SoldiersAndCivilians {
    public static void kWeakestRows(int matrix[][], int k) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int arr[]=new int[k];

        int strength[] = new int[rowSize];

        for (int i = 0; i < rowSize; i++) {
            int count=0;
            for (int j = 0; j < colSize; j++) {
                if(matrix[i][j]==1){
                    count++;
                }
            }
            // if(count>)
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };
    }
}
