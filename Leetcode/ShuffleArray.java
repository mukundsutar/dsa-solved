package Leetcode;

public class ShuffleArray {
    public static int[] shuffle(int nums[]) {
        int n = nums.length / 2;
        int ans[] = new int[nums.length];

        for (int i = 0; i < n-1; i++) {
            ans[i]=nums[i];
            ans[i+1]=nums[i+n];
        }
        return ans;
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 2, 5, 1, 3, 4, 7 };
        printArray(shuffle(nums));
    }
}
