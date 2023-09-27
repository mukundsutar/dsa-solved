package Patterns;

public class TriangleNumber {
    public static void main(String[] args) {
        int num = 4;

        /*
         * 1
         * 12
         * 123
         * 1234
         */
        for (int line = 1; line <= num; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

        /*
         * 1234
         * 123
         * 12
         * 1
         */
        for (int line = 1; line <= num; line++) {
            for (int number = 1; number <= num - line + 1; number++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
