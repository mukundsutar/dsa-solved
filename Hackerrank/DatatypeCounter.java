package Hackerrank;

public class DatatypeCounter {
    public static void typeCounter(String sentence) {
        int str = 0;
        int integer = 0;
        int doub = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);

            boolean isOkay = true;

            if (letter == ' ' && i >= 1) {
                isOkay = true;
            } else if (i == sentence.length() - 1) {
                isOkay = true;
            } else {
                isOkay = false;
            }

            if (isOkay) {
                if (Character.isDigit(sentence.charAt(i - 1))) {
                    integer++;
                } else if (Character.isLetter(sentence.charAt(i - 1))) {
                    str++;
                }
            } else if (letter == '.') {
                doub++;
                integer= integer-1;
            }
        }

        System.out.println("string " + str);
        System.out.println("integer " + integer);
        System.out.println("double " + doub);
    }

    public static void main(String[] args) {
        String sentence = "string 2 3.54";

        typeCounter(sentence);
    }
}
