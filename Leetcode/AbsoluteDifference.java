package Leetcode;

public class AbsoluteDifference {
    public static int absDiff(int nums[], int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 5, 4 };

        
        System.out.println(absDiff(nums, 2));
    }
}
