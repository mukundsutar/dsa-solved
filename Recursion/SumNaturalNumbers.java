package Recursion;

public class SumNaturalNumbers {
    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }

        int n_1 = sumNatural(n - 1);

        int calc = n + n_1;

        return calc;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(sumNatural(n));
    }
}
