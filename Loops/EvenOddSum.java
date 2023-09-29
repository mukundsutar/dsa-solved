package Loops;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num= sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while(num > 0) {
            int last = num%10;
            if (last%2==0) {
                evenSum = evenSum + last;
            } else {
                oddSum = oddSum + last;
            }
            num = num / 10;
        }

        System.out.println("Sum of Even numbers: " + evenSum);
        System.out.println("Sum of Odd numbers: " + oddSum);

        sc.close();
    }
}