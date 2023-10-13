package Leetcode;

public class SmallestEvenMultiple {
    public static int findMultiple(int n) {
        int i=1;

        while(n>0){
            if(i%n==0 && i%2==0){
                return i;
            }

            i++;
        }

        return 0;
    }

    public static void main(String[] args) {
        int n=5;

        System.out.println(findMultiple(n));
    }
}
