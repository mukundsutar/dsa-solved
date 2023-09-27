package Strings;

public class Substrings {
    public static String printSubstring(String str, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            // sub= sub + str.charAt(i);
            sub += str.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println(printSubstring(str, 0, 4));
    }
}
