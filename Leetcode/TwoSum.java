package Leetcode;

public class TwoSum {
    public static int[] sumTwo(int arr[], int target) {
        int two[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    two[0] = i;
                    two[1] = j;
                }
            }
        }
        return two;
    }

    public static void printArray(int two[]) {
        for(int i=0; i<two.length; i++){
            System.out.print(two[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};

        printArray(sumTwo(arr, 9));
    }
}
