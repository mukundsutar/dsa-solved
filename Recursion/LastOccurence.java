package Recursion;

public class LastOccurence {
    public static int last(int nums[], int key, int i) {

        if (i == nums.length) {
            return -1;
        }

        int lastN = last(nums, key, i + 1);

        if (lastN == -1 && nums[i] == key) {
            return i;
        }

        return lastN;
    }

    public static void main(String[] args) {
        int nums[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };

        System.out.println(last(nums, 5, 0));
    }
}
