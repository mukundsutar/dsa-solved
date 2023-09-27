package Recursion;

public class Power {
    public static int raisedTo(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * raisedTo(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(raisedTo(2, 10));
    }
}
