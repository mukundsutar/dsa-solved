package twodimentional;

public class Spiral2 {
    public static void spiralPrint(int matrix[][]) {
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j < endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow; i < endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol; j > startCol; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow; i > startRow; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 26, 17, 6, 23, 17 },
                            { 0, 14, 8, 23, 18 },
                            { 25, 18, 12, 19, 20 },
                            { 20, 21, 12, 5, 6 },
                            { 11, 9, 9, 22, 18 } };

        spiralPrint(matrix);
    }
}
