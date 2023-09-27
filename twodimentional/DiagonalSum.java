package twodimentional;

public class DiagonalSum {
    public static void diagonal(int matrix[][]) {
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        // for(int j=0; j<matrix[0].length; j++){
        // if(i==j){
        // sum = matrix[i][j] + sum;
        // }
        // if(i+j==matrix.length-1){
        // sum = matrix[i][j] + sum;
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) {
            // primary
            sum = matrix[i][i] + sum;

            // secondary
            if (i != matrix.length - 1 - i) {
                sum = matrix[i][matrix.length - 1 - i] + sum;
            }

        }

        System.out.println("Sum of Diagonals= " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        diagonal(matrix);
    }
}
