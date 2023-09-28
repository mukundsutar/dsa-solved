package Accenture_Practice;

public class AddDigits {
    public static int addAllDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int num = 123;

        System.out.println(addAllDigits(num));
    }
}
