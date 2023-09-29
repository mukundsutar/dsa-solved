package Accenture_Practice;

import java.util.Scanner;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();

        System.out.println("Area of Square " + (side * side));

        sc.close();
    }
}
