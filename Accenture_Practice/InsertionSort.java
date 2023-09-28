package Accenture_Practice;

public class InsertionSort {
    public static void doInsertionSort(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i - 1;

            while (prev >= 0 && nums[prev] > curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }

        printArray(nums);
    }

    public static void printArray(int nums[]) {
        System.out.print("[ ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.print("]");
    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };

        doInsertionSort(nums);
    }
}
