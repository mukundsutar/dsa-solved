package Recursion;

public class NumbersToWords {
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numToWords(int number) {
        // base case
        if (number == 0) {
            return;
        }

        // kaam
        int lastDigit = number % 10;
        numToWords(number / 10);

        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        numToWords(1947);
    }
}
