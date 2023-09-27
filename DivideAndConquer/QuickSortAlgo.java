package DivideAndConquer;

public class QuickSortAlgo {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void quickSort(int nums[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partition(nums, si, ei); // index of partition after rearranging elements
        quickSort(nums, si, pIdx - 1); // left part of partition
        quickSort(nums, pIdx + 1, ei); // right part of partition
    }

    public static int partition(int nums[], int si, int ei) {
        int pivot = nums[ei];
        int i = si - 1; // to place elements smaller than partition

        for (int j = si; j < ei; j++) {
            if (nums[j] <= pivot) {
                i++;

                // swap smaller elements
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        // place partition in sorted manner, i.e. in middle
        i++;
        int temp = pivot;
        nums[ei] = nums[i];
        nums[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 8, 2, 5 };

        quickSort(nums, 0, nums.length - 1);
        printArray(nums);
    }
}
