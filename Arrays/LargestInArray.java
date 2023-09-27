package Arrays;

public class LargestInArray {
    public static int largest(int numbers[]) {
        int largestN = Integer.MIN_VALUE;
        int smallestN = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largestN < numbers[i]) {
                largestN = numbers[i];
            }
            if (smallestN > numbers[i]) {
                smallestN = numbers[i];
            }
        }
        System.out.println("Smallest number is " + smallestN);
        return largestN;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 1, 3, 78, 54, -3 };

        System.out.println("Largest number is " + largest(numbers));
    }
}
