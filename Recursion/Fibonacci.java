package Recursion;

public class Fibonacci {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int calc;

        calc = fib(n - 1) + fib(n - 2);

        return calc;
    }

    public static void main(String[] args) {
        int n = 19;

        System.out.println(fib(n));
    }
}
