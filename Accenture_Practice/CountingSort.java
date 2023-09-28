package Accenture_Practice;

public class CountingSort {
    public static void doCountingSort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
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

        doCountingSort(nums);
    }
}
