package twodimentional;

public class SearchSorted {
    public static boolean searchSortedMatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] > key) {
                col--;
            } else if (matrix[row][col] < key) {
                row++;
            } else if (matrix[row][col] == key) {
                System.out.println("Found at " + "(" + row + ", " + col + ")");
                return true;
            }
        }
        System.out.println("Number not in the Matrix");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        searchSortedMatrix(matrix, 33);
    }
}
