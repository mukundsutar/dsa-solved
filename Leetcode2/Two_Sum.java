package Leetcode2;

public class Two_Sum {

    public static int[] twoSum(int nums[], int target) {
        int two[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    two[0] = i;
                    two[1] = j;
                }
            }
        }

        return two;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };

        System.out.println((twoSum(nums, 9)));
    }
}
