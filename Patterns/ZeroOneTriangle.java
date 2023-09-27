package Patterns;

public class ZeroOneTriangle {
    public static void zeroOneTri(int num) {
        int counter = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter % 2);
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zeroOneTri(5);
    }
}
