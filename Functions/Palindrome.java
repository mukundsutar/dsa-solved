package Functions;

import java.util.Scanner;

public class Palindrome {
    public static int reverse(int num) {
        int rev = 0;

        while (num > 0) {
            int last = num % 10;

            rev = (rev * 10) + last;
            num = num / 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int num) { // 1234
        int revD = reverse(num); // 4321

        while (num > 0) {
            int last = num % 10; // 123, 12, 1
            int end = revD % 10; // 432, 43, 4

            if (last != end) { // If palindrome continue if not exit
                return false;
            }

            revD = revD / 10;
            num = num / 10;
        }
        return true; // Palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isPalindrome(num));

        sc.close();
    }
}
