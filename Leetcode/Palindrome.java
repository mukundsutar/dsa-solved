package Leetcode;

public class Palindrome {
    public static boolean palindrome(int x) {
        int original= x;
        int remainder = 0;
        int revnum = 0;

        if(x<0){
            return false;
        }

        while (x != 0) {
            remainder = x % 10;
            revnum = revnum * 10 + remainder;
            x = x / 10;
        }

        if(revnum==original){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int x = -121;

        System.out.println(palindrome(x));
    }
}
