package Accenture_Practice;

public class ComputeAverage {
    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(avg(a, b, c));
    }
}
