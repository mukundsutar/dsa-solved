package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> findFizzBuzz(int n) {
        List<String> str = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                str.add("FizzBuzz");
            } else if ((i % 3 == 0) && (i % 5 != 0)) {
                str.add("Fizz");
            } else if ((i % 5 == 0) && (i % 3 != 0)) {
                str.add("Buzz");
            } else {
                str.add(i + "");
            }
        }

        return str;
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(findFizzBuzz(n));
    }
}
