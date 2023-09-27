package Leetcode;

public class ZigZagConversion {

    public static void convert(String s, int numRows) {
        String str = "";
        int size = numRows;
        numRows++;

        for (int i = 0; i < numRows; i++) {
            if (i != 0) {
                numRows -= 2;
            }
            for (int j = i; j < s.length(); j += numRows) {
                str = str + s.charAt(j) + " ";

                if (numRows == 0) {
                    numRows = size + 1;
                }
            }
        }

        System.out.println("Encrypt_2: " + str);
    }

    public static void printString(String s, String message) {
        System.out.print(message);

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        String e = "PINALSIGYAHRPI";

        printString(s, "Plain:     ");
        printString(e, "Encrypted: ");

        convert(s, 3);
    }
}
