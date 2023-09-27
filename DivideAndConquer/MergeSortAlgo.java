package DivideAndConquer;

public class MergeSortAlgo {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void mergeSort(int nums[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // (si + ei) / 2

        mergeSort(nums, si, mid); // left part
        mergeSort(nums, mid + 1, ei); // right part

        merge(nums, si, mid, ei); // merge
    }

    public static void merge(int nums[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (nums[i] <= nums[j]) { // left smal or Top small
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        // left overs of left part
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        // left overs of right part
        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int nums[] = { 6, 3, 9, 2, 5, 8, 1 };

        mergeSort(nums, 0, nums.length-1);
        printArray(nums);
    }
}
