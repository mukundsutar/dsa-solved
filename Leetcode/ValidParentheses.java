package Leetcode;

public class ValidParentheses {

    public static boolean isValid(String s) {

        int max = 0;

        if (s.length() % 2 != 0) {
            return false;
        } else {
            max = s.length() / 2;
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '{' && max != 0) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '}') {

                        max--;
                        break;
                    }
                }

            } else if (s.charAt(i) == '(' && max != 0) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == ')') {
                        max--;
                        break;
                    }
                }

            } else if (s.charAt(i) == '[' && max != 0) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == ']') {
                        max--;
                        break;
                    }
                }
            }
        }

        if (max > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String s = "{()}";

        System.out.println(isValid(s));
    }
}
