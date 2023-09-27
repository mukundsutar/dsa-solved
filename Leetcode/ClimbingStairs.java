package Leetcode;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        } else if(n==2){
            return 2;
        }

        int OneStep= climbStairs(n-1);
        int TwoStep= climbStairs(n-2);

        return OneStep + TwoStep;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
