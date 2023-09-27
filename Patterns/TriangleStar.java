package Patterns;

public class TriangleStar {
    public static void main(String[] args) {

        int num = 4;

        /*
         * *
         * **
         * ***
         * ****
         */
        for (int line = 1; line <= num; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         * ****
         * ***
         * **
         * *
         */
        for (int line = 1; line <= num; line++) {
            for (int star = 1; star <= num - line + 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
