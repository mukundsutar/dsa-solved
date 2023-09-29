package Accenture_Practice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float avg = (a + b + c) / 3;

        System.out.println("Average of " + a + ", " + b + ", " + c + " is " + avg + ".");

        sc.close();
    }
}
