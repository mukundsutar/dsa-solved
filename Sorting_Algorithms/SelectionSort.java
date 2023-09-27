package Sorting_Algorithms;

public class SelectionSort {
    public static void selectionS(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minPos = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }

            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        selectionS(arr);
        printArray(arr);
    }
}
