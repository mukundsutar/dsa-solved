package Backtracking;

public class GridWaysFormula {
    public static int factorial(int num) {
        int calc = num;
        for (int i = num - 1; i >= 1; i--) {
            calc = calc * i;
        }
        return calc;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;

        int total = factorial(n - 1 + m - 1) / (factorial(n - 1) * factorial(m - 1));

        System.out.println("Total possible ways: " + total);
    }
}
