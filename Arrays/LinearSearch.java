package Arrays;

public class LinearSearch {
    public static int linear(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 6, 14, 7, 3, 90 };
        int key = 7;

        int index = linear(numbers, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at " + index + " index");
        }
    }
}
