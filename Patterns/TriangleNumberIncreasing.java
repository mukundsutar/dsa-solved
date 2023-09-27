package Patterns;

public class TriangleNumberIncreasing {
    public static void main(String[] args) {
        int num = 4;
        int n1 = 1;
        int n2 = 1;

        /*
         * 1
         * 23
         * 456
         * 789 10
         */
        for (int line = 1; line <= num; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(n1 + " ");
                n1++;
            }
            System.out.println();
        }

        /*
         * 1234
         * 567
         * 89
         * 10
         */
        for (int line = 1; line <= num; line++) {
            for (int number = 1; number <= num - line + 1; number++) {
                System.out.print(n2 + " ");
                n2++;
            }
            System.out.println();
        }
    }
}
