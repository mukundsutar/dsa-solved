package Leetcode;

public class FlipImage {
    public static int[][] flipAndInvertImage(int image[][]) {
        int size = image.length;
        int imageTemp[][] = new int[size][size];

        // for (int row = 0; row < n; row++) {
        // int i=0;
        // for (int col = n-1; col > 0; col--) {
        // while(row !=col){
        // int temp= image[row][i];
        // image[row][i]= image[row][col];
        // image[row][col]= temp;

        // i++;
        // }
        // }
        // }
        for (int row = 0; row < size; row++) {
            int j = 0;
            for (int col = size - 1; col >= 0; col--) {
                imageTemp[row][j] = image[row][col];
                j++;
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (imageTemp[row][col] == 0) {
                    image[row][col] = 1;
                } else {
                    image[row][col] = 0;
                }
            }
        }

        return image;
    }

    public static void main(String[] args) {
        int image[][] =   { { 1, 1, 0 },
                            { 1, 0, 1 },
                            { 0, 0, 0 } };
    }
}
