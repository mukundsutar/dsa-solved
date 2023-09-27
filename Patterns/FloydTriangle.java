package Patterns;

public class FloydTriangle {
    public static void floydTri(int num) {
        int n = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floydTri(5);
    }
}
