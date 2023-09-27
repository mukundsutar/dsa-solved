package Functions;

import java.util.Scanner;

public class DigitSum {
    public static int sum(int num) {
        int rev = 0;

        while (num > 0) {
            int last = num % 10;
            rev = rev + last;
            num = num / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(sum(number));
    }
}
