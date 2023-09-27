package Leetcode;

public class RichestCustomerWealth {
    public static int richest(int accounts[][]) {
        int sum = 0;
        int largest = 0;

        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum = accounts[i][j] + sum;
            }
            if (largest < sum) {
                largest = sum;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int accounts[][] = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };

        System.out.println(richest(accounts));
    }
}