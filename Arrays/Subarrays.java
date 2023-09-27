package Arrays;

public class Subarrays {
    public static void printSubarr_allay(int numbers[]) {
        int ts = 0;
        int subarr_all = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int subarr = 0;

                for (int k = start; k <= end; k++) {
                    subarr = numbers[k] + subarr;
                    subarr_all = numbers[k] + subarr_all;

                    System.out.print(numbers[k] + " ");
                }

                System.out.print(" = " + subarr);
                ts++;
                System.out.println();
            }
            System.out.println("Sum All= " + subarr_all);
            System.out.println();
        }
        System.out.println("Total Subarr_allays= " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printSubarr_allay(numbers);
    }
}
