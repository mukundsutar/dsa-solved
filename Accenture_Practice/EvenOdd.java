package Accenture_Practice;

public class EvenOdd {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 11;

        System.out.println(isEven(num));
    }
}
