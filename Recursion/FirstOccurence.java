package Recursion;

public class FirstOccurence {
    public static int first(int nums[], int key, int i) {
        if (i == nums.length) {
            return -1;
        }

        if (nums[i] == key) {
            return i;
        }

        return first(nums, key, i + 1);
    }

    public static void main(String[] args) {
        int nums[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };

        System.out.println(first(nums, 3, 0));
    }
}
