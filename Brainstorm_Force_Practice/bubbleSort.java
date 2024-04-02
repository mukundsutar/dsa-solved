package Brainstorm_Force_Practice;

public class bubbleSort {
    public static void sort_bubbles(int nums[]) {
        for (int turn = 0; turn < nums.length - 1; turn++) {
            for (int ele = 0; ele < nums.length - 1; ele++) {
                if (nums[ele] > nums[ele + 1]) {
                    // swap
                    int temp = nums[ele];
                    nums[ele] = nums[ele + 1];
                    nums[ele + 1] = temp;
                }
            }
        }
    }
    
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };

        sort_bubbles(nums);
        printArray(nums);
    }
}
