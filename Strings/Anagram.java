package Strings;

import java.util.*;

public class Anagram {
    public static boolean findAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1Arr = str1.toCharArray();
            char[] str2Arr = str2.toCharArray();

            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            if (Arrays.equals(str1Arr, str2Arr)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1= "carryace";
        String str2= "racecar";

        System.out.println(findAnagram(str1, str2));
    }
}
