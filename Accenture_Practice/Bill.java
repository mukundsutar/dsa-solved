package Accenture_Practice;

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen, pencil, eraser;

        // float pen = sc.nextFloat();
        // float pencil = sc.nextFloat();
        // float eraser = sc.nextFloat();

        pen = 10;
        pencil = 13;
        eraser = 5;

        float sum = pen + pencil + eraser;
        float total = sum * (1 + 0.18f);

        System.out.println("Your total bill generated is: " + total);

        sc.close();
    }
}
