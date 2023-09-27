package Recursion;

public class TilingProblem {
    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int verticalWays = tiling(n - 1);

        int horizontalWays = tiling(n - 2);

        return verticalWays + horizontalWays;
    }

    public static void main(String[] args) {
        System.out.println(tiling(4));
    }
}
