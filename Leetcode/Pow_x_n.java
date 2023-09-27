package Leetcode;

public class Pow_x_n {
    public static double power(double x, int n) {
        if(n==1){
            return 0;
        }

        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
