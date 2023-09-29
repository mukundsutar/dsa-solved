package Accenture_Practice;

import java.util.*;

public class ShuffleString {
    public static String restoreString(String s, int indices[]) {
        StringBuilder restored = new StringBuilder();
        int strLength = s.length();
        char c[] = new char[strLength];

        for (int i = 0; i < strLength; i++) {
            c[indices[i]] = s.charAt(i);
        }

        restored.append(c);

        return restored.toString();
    }

    public static void main(String[] args) {
        String s = "CODELEET";
        int indices[] = { 4, 5, 6, 7, 0, 2, 1, 3 };

        System.out.println(restoreString(s, indices));
    }
}
