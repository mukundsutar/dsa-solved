package Accenture_Practice;

public class PrintSumRow {
    public static int calcSum(int nums[][]) {
        int sum=0;

        for (int i = 0; i < nums.length; i++) {
            sum= sum+ nums[1][i];
        }

        return sum;
    }
    
    public static void main(String[] args) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };

        System.out.println(calcSum(nums));
    }
}
