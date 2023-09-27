package DivideAndConquer;

public class ModifiedBinarySearchAlgo {
    public static int modifiedBinarySearch(int nums[], int target, int si, int ei) {
        // kaam
        int mid = si + (ei - si) / 2;

        // BEST CASE: found at mid
        if (target == nums[mid]) {
            return mid;
        }

        // mid on L1
        if (nums[si] <= nums[mid]) { // [4_si, 5, 6, 7_mid, 0*, 1, 2_ei]
            // case a: left [si-----target-----mid---------------ei]
            if (nums[si] <= target && target <= nums[mid]) {
                return modifiedBinarySearch(nums, target, si, mid - 1);
            } else {
                // case a: right [si-----mid----------target----------ei]
                return modifiedBinarySearch(nums, target, mid + 1, ei);
            }
        }

        // mid on L2
        else {
            // case a: right [si---------------mid-----target-----ei]
            if (nums[mid] <= target && target <= nums[ei]) {
                return modifiedBinarySearch(nums, target, mid + 1, ei);
            } else {
                // case a: right [si----------target-----mid-----ei]
                return modifiedBinarySearch(nums, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int tarIdx = modifiedBinarySearch(nums, target, 0, nums.length - 1);

        System.out.println(tarIdx);
    }
}
