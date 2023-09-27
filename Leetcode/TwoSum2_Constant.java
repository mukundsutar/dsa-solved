package Leetcode;

public class TwoSum2_Constant {
    public static int[] twoSumCont(int numbers[], int target) {
        // int size = numbers.length;
        // int mid = size / 2;
        // int sumLeft = 0;
        // int sumRight= 0;

        // int two[] = new int[2];

        // //left sum
        // for (int i = 0; i < mid; i++) {
        // sumLeft = sumLeft + numbers[i];
        // }
        // //right sum
        // for (int i = 0; mid < size; i++) {
        // sumRight = sumRight + numbers[i];
        // }

        // if (sumLeft <= target) {
        // for(int i=0; i<mid; i++){
        // for(int )
        // }
        // }else if(sumRight<=target){

        // }

        // int two[] = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        int size = numbers.length - 1;

        for (int i = 0; i < size; i++) {
            int sum = numbers[start] + numbers[end];

            // if the sum is same as target then of, else if reduce the end or
            // increase the start as this is a sorted array
            if (sum == target) { // 2+15=17, 17 is bigger than 9 then reduce the bigger number (2+13=15)
                return new int[] { start + 1, end + 1 }; // add [start+1, two[j]=end+1] to a new array and return
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return new int[0]; //return null array
    }

    public static void printnumbersay(int two[]) {
        for (int i = 0; i < two.length; i++) {
            System.out.print(two[i] + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 7, 11, 15 };

        printnumbersay(twoSumCont(numbers, 9));
    }
}
