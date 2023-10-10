package Leetcode;

public class PlusOne {
    public static void addOne(int digits[]) {
        int sum = 0;
        int ten = 0;
        if (digits.length > 1) {
            ten = (int) Math.pow(10, digits.length - 1);
        } else {
            ten = (int) Math.pow(1, digits.length);
        }

        for (int i = 0; i < digits.length; i++) {
            sum = sum + ten * digits[i];
            ten = ten / 10;
        }

        sum++;

        String numStr = String.valueOf(sum);

        System.out.println(numStr);

        int numArr[]=new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            numArr[i] = numStr.charAt(i) - '0';
        }

        printArray(numArr);
    }

    public static void printArray(int numArr[]) {
    System.out.print("[");
    for (int i = 0; i < numArr.length; i++) {
    System.out.print(numArr[i] + " ");
    }
    System.out.print("]");
    }

    public static void main(String[] args) {
        int digits[] = { 1, 2, 3 };

        addOne(digits);
    }
}
