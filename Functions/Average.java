package Functions;

public class Average {
    public static int avg(int a, int b) {
        return (a + b) / 2;
    }

    public static int avg(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static int avg(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
    }

    public static void main(String[] args) {
        System.out.println(avg(8, 70));
    }
}
