package Patterns;

public class InvertedTriangle {
    public static void invertedTri(int num) {
        // int n= num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j + " ");
            }
            // n--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedTri(5);
    }
}
