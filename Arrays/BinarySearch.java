package Arrays;

public class BinarySearch {
    public static int binary(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 3, 5, 7, 9, 11 };
        int key = 9;

        int index = binary(numbers, key) + 1;
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + index);
        }
    }
}
