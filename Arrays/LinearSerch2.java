package Arrays;

public class LinearSerch2 {
    public static int linear(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 1, 3, 78, 54 };
        int key = 98;

        int index = linear(numbers, key);

        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at " + index + " index");
        }
    }
}
