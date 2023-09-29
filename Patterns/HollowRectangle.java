package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    private static void hollowRect(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of Coloumns: ");
        int column = sc.nextInt();

        hollowRect(row, column);

        sc.close();
    }
}
