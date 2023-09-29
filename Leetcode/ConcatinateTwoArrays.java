package Leetcode;

public class ConcatinateTwoArrays {
    public static void concatinate(int nums[]) {
        int n = nums.length * 2;
        int ans[] = new int[n];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i + nums.length] = nums[i];
        }
    }

    public static void print(int ans[]) {
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int nums[] = new int[1000];
        int nums[] = { 1, 3, 2, 1 };
        concatinate(nums);
        print(nums);
    }
}
