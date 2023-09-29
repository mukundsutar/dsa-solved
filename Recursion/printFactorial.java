package Recursion;

public class printFactorial {
    public static int printFact(int n) {
        int calc = 0;

        if (n == 0) {
            calc++;
            return calc;
        }

        calc = n * printFact(n - 1);

        return calc;
    }

    public static void main(String[] args) {
        int n = 8;

        System.out.println(printFact(n));
    }
}
