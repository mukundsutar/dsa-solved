package Leetcode;

public class RunningSum {
    public static void sumRunning(int nums[]) {
        // int prev=nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                continue;
            } else {
                nums[i] = nums[i - 1] + nums[i];
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        sumRunning(nums);
    }
}
