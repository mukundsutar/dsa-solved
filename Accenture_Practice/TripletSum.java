package Accenture_Practice;

public class TripletSum {
    public static void findTriplet(int nums[]) {
        int arrLength = nums.length;
        String printStr = "";

        for (int i = 0; i < arrLength; i++) {
            for (int j = i + 1; j < arrLength - 1; j++) {
                for (int x = i + 2; x < arrLength - 2; x++) {
                    if (nums[i] + nums[j] + nums[x] == 0) {
                        // System.out.println(nums[i] + " " + nums[j] + " " + nums[x]);

                        printStr = "[" + nums[i] + " " + nums[j] + " " + nums[x] + "]" + printStr;
                    }
                }
            }
        }

        System.out.println(printStr);
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };

        findTriplet(nums);
    }
}
