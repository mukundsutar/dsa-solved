package Leetcode;

import java.util.Arrays;

public class Decompression {
    public static int[] decompression(int nums[]) {
        // for decomp size
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum = nums[i] + sum;
        }
        int decomp[] = new int[sum];

        // final results
        int index = 0;
        for (int i = 0; i < nums.length; i += 2) {
            // dest array, start index, end index, value
            Arrays.fill(decomp, index, index + nums[i], nums[i + 1]);
            index += nums[i];
        }

        return decomp;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 3 };

        decompression(nums);
    }
}
