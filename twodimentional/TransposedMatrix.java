package twodimentional;

public class TransposedMatrix {
    public static int[][] transpose(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        int tM[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tM[j][i] = matrix[i][j];
            }
        }
        return tM;
    }
    public static void printMatrix(int tM[][]) {
        for (int i = 0; i < tM.length; i++) {
            for(int j=0; j< tM[0].length; j++){
                System.out.print(tM[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 },
                            { 8, 8, 7 } };

        printMatrix(transpose(matrix));
    }
}
